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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if (root == null) return false;
        if (root.left == null && root.right == null){
            if (root.val == targetSum) return true;
            else return false;
        }
        int sum = 0;
        int depth =0;

        return dfs(root, sum, targetSum, depth);
        
    }

    boolean dfs (TreeNode root, int sum, int targetSum, int depth){

        if (root != null){
            sum += root.val;
            depth++;
            return dfs(root.left, sum, targetSum, depth) || dfs(root.right, sum, targetSum, depth);
        }else{
            if (sum == targetSum && depth > 1) return true;
            else return false;
        }

    }
}