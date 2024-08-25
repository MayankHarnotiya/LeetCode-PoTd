/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
    public List<Integer> postorderTraversal(TreeNode root) {
         ArrayList<Integer> res=new ArrayList<>();
        if(root==null)
        return res;
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null|| !st.isEmpty())
        {
            if(curr!=null)
            {
                st.add(curr);
                curr=curr.left;
            }
            else{
                TreeNode temp=st.peek().right;
                if(temp==null)
                {
                    temp=st.peek();
                    st.pop();
                    res.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right)
                    {
                        temp=st.peek();
                        st.pop();
                        res.add(temp.val);
                    }
                }
                else{
                    curr=temp;
                }
            }
        }
        return res;
        
    }
   
}
