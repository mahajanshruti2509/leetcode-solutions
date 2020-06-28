/*
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
*/


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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()) {
            
            List<Integer> currentLevel1 = new ArrayList<>();
            while(!s1.isEmpty()) {
                TreeNode current = s1.pop();
                currentLevel1.add(current.val);
                if(current.left != null) {
                    s2.push(current.left);
                }
                if(current.right != null) {
                    s2.push(current.right);
                }
            }
            if(currentLevel1.size() > 0) {
                result.add(currentLevel1);
            }
            
            List<Integer> currentLevel2 = new ArrayList<>();
            while(!s2.isEmpty()) {
                TreeNode current = s2.pop();
                currentLevel2.add(current.val);
                if(current.right != null) {
                    s1.push(current.right);
                }
                if(current.left != null) {
                    s1.push(current.left);
                }
            }
            if(currentLevel2.size() > 0) {
                result.add(currentLevel2);
            }
        }// outer while 
        return result;
    }
}
