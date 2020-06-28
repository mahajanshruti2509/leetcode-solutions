/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }
    
    private boolean isSymmetric(TreeNode leftSub, TreeNode rightSub) {
        if(leftSub == null && rightSub == null) {
           return true;
        } else if(leftSub != null && rightSub != null) {
            return leftSub. val == rightSub.val
                && isSymmetric(leftSub.right, rightSub.left)
                && isSymmetric(leftSub.left, rightSub.right);
        }
        return false;
    }
}
