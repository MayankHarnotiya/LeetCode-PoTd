/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int mat[][] = new int[m][n];
        // Fill the matrix with -1 initially
        for (int[] row : mat) {
            Arrays.fill(row, -1);
        }

        int left = 0, right = n - 1;
        int top = 0, down = m - 1;
        int id = 0;

        // Traverse the matrix in a spiral order and fill it
        while (top <= down && left <= right && head != null) {
            if (id == 0) {  // Traverse from left to right
                for (int i = left; i <= right && head != null; i++) {
                    mat[top][i] = head.val;
                    head = head.next;
                }
                top++;
            } else if (id == 1) {  // Traverse from top to down
                for (int i = top; i <= down && head != null; i++) {
                    mat[i][right] = head.val;
                    head = head.next;
                }
                right--;
            } else if (id == 2) {  // Traverse from right to left
                for (int i = right; i >= left && head != null; i--) {
                    mat[down][i] = head.val;
                    head = head.next;
                }
                down--;
            } else if (id == 3) {  // Traverse from down to top
                for (int i = down; i >= top && head != null; i--) {
                    mat[i][left] = head.val;
                    head = head.next;
                }
                left++;
            }
            // Update direction for the next traversal
            id = (id + 1) % 4;
        }

        return mat;
    }
}
