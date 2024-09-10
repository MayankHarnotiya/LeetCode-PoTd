/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head.next;
        ListNode prev=head;
        while(temp!=null)
        {
            int a=prev.val;
            int b=temp.val;
            int x=find_gcd(a,b);
            ListNode new_node=new ListNode(x);
            prev.next=null;
            prev.next=new_node;
            new_node.next=temp;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public int find_gcd(int a,int b)
    {
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++)
        {
          if(a%i==0 && b%i==0)
          {
            gcd=i;
          }
        }
        return gcd;
    }
}