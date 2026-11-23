// Problem: Binary Tree Preorder Traversal
// Platform: LeetCode-144
// Approach: Iterative using stack - check for right child and add it, then check for left child and add it
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();

            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);

            list.add(curr.val);
        }

        return list;
    }
}