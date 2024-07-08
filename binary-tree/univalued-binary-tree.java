class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true; // If the tree is empty, it's a unival tree
        return helper(root, root.val);
    }
    
    public boolean helper(TreeNode root, int val) {
        if (root == null) return true; // Base case: null nodes are considered unival

        // Check if the current node matches the given value
        if (root.val != val) return false;

        // Recursively check the left and right subtrees
        return helper(root.left, val) && helper(root.right, val);
    }
}