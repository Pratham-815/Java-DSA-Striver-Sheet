class Leetcode_110 {
    // Main function to check if binary tree is height-balanced
    // A balanced tree: height difference between left and right subtrees <= 1 for every node
    public boolean isBalanced(TreeNode root) { 
        return checkHeight(root) != -1;
    }

    // Helper function that returns height if balanced, -1 if unbalanced
    // Uses bottom-up approach to check balance while calculating height
    private int checkHeight(TreeNode node) {
        // Base case: null node has height 0 and is balanced
        if (node == null) return 0;

        // Recursively check left subtree
        int left = checkHeight(node.left);
        if (left == -1) return -1; // Early termination: left subtree unbalanced

        // Recursively check right subtree
        int right = checkHeight(node.right);
        if (right == -1) return -1; // Early termination: right subtree unbalanced

        // Check if current node violates balance condition
        if (Math.abs(left - right) > 1) {
            return -1; // Height difference > 1, tree is unbalanced
        }

        // Return height of current subtree (max of children + 1)
        return Math.max(left, right) + 1;
    }
}

/*
Time Complexity: O(n)
- We visit each node exactly once
- At each node, we perform constant time operations
- n = number of nodes in the tree

Space Complexity: O(h)
- Recursive call stack depth equals tree height
- Best case (balanced tree): O(log n)
- Worst case (skewed tree): O(n)
- h = height of the tree
*/
