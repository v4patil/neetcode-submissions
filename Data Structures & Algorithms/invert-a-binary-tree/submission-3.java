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
        public static TreeNode invertTree(TreeNode root) {//depth First Search
        if(root == null){
            return  null;
        }
        TreeNode leftNode = root.left;
        root.left = root.right;
        root.right = leftNode;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}
