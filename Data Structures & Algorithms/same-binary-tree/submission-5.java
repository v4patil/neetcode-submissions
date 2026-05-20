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
        public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        Queue<TreeNode> pNode = new LinkedList<>();
        Queue<TreeNode> qNode = new LinkedList<>();

        pNode.offer(p);
        qNode.offer(q);

        while (!pNode.isEmpty() && !qNode.isEmpty()) {
            TreeNode pCurrentNode = pNode.poll();
            TreeNode qCurrentNode = qNode.poll();
            if (pCurrentNode.val != qCurrentNode.val) {// check the value
                return false;
            }
            if ((pCurrentNode.left == null) != (qCurrentNode.left == null))//check the structure
                return false;

            if ((pCurrentNode.right == null) != (qCurrentNode.right == null))// check the structure
                return false;

            if (pCurrentNode.left != null) {
                pNode.offer(pCurrentNode.left);
                qNode.offer(qCurrentNode.left);
            }

            if (pCurrentNode.right != null) {
                pNode.offer(pCurrentNode.right);
                qNode.offer(qCurrentNode.right);
            }
        }
        return pNode.isEmpty() && qNode.isEmpty();
    }
}
