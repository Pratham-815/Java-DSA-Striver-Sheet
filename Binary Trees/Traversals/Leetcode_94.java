// Importing necessary libraries
import java.util.*;

// Class to solve Leetcode problem 94: Binary Tree Inorder Traversal
public class Leetcode_94 {
    // Method to perform inorder traversal of a binary tree
    public List<Integer> inorderTraversal(TreeNode root) {
        // Initialize a list to store the result
        ArrayList<Integer> res = new ArrayList<>();
        // Call the helper method to perform the traversal
        inOrder(root, res);
        // Return the result list containing inorder traversal
        // Time Complexity: O(n) where n is the number of nodes in the tree
        // Space Complexity: O(h) where h is the height of the tree due to recursion stack
        // In worst case (skewed tree), space complexity is O(n)
        return res;
    }

    // Helper method to perform recursive inorder traversal
    public void inOrder(TreeNode node, ArrayList<Integer> res){
        // Base case: if the node is null, return
        if(node == null){
            return;
        }
        // Recursive call to traverse the left subtree
        inOrder(node.left, res);
        // Add the value of the current node to the result list
        res.add(node.val);
        // Recursive call to traverse the right subtree
        inOrder(node.right, res);
    }
}
