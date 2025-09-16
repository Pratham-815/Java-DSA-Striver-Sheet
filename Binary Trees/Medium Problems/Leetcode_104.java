/**
 * Solution for LeetCode Problem 104: Maximum Depth of Binary Tree
 * 
 * This class provides a solution to find the maximum depth (height) of a binary tree.
 * The maximum depth is the number of nodes along the longest path from the root node
 * down to the farthest leaf node.
 * 
 * Algorithm Approach:
 * - Uses recursive depth-first search (DFS) approach
 * - For each node, calculates the maximum depth of left and right subtrees
 * - Returns 1 + maximum of left and right subtree depths
 * - Base case: if node is null, return 0
 * 
 * Time Complexity: O(n) where n is the number of nodes in the tree
 * - We visit each node exactly once during the traversal
 * 
 * Space Complexity: O(h) where h is the height of the tree
 * - In worst case (skewed tree): O(n) due to recursion stack
 * - In best case (balanced tree): O(log n) due to recursion stack
 * 
 * @author GitHub Copilot
 */
public class Leetcode_104{
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int depth = 1 + Math.max(left, right);

        return depth;
    }
}