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
    int ma = 1;
    int mi = -1;
    public boolean isBalanced(TreeNode root) {
      checkBalanced(root);

      return ma==1 && mi==-1;
    }
    public int checkBalanced(TreeNode root){
        if(root==null)return 0;
        int l = checkBalanced(root.left);
        int r = checkBalanced(root.right);
        ma = Math.max(ma, Math.abs(l-r));
        mi = Math.min(mi, Math.abs(l-r));
        return Math.max(l,r)+1;
    }
}
