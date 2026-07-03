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
    int maxL = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return maxL;
    }
    public int findDia(TreeNode root) {
        if (root == null)
            return 0;

        int l = findDia(root.left); // trav left part
        int r = findDia(root.right); // trav right part

        int curr = Math.max(l,r)+1;

        maxL = Math.max(l+r, maxL);
        return curr;
    }
}
