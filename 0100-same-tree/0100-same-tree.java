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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        String s1 = dfs(p, "");
        String s2 = dfs(q, "");

        System.out.println(s1);
        if (s1.equals(s2)) return true;
        else return false;
    }

    String dfs(TreeNode node, String s){
        if (node == null){
            return s+"null";
        }

        s = s + node.val;

        return dfs(node.left, s) + dfs(node.right, s);
    }
}