import java.util.*;

public class Leetcode_144 {
    // LeetCode 144: Binary Tree Preorder Traversal
    // Time Complexity: O(n) where n is the number of nodes
    // Space Complexity: O(h) where h is the height of the tree (recursion stack)
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    // Helper method for recursive preorder traversal
    // Preorder: Root -> Left -> Right
    public void preOrder(TreeNode node, List<Integer> res){
        // Base case: if current node is null, return
        if(node == null){
            return;
        }
        
        // Process current node (Root)
        res.add(node.val);
        
        // Recursively traverse left subtree
        preOrder(node.left, res);
        
        // Recursively traverse right subtree
        preOrder(node.right, res);
    }
}
