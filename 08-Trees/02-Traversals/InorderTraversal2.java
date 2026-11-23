// Problem: Binary Tree Inorder Traversal
// Platform: LeetCode-94
// Approach: Iterative DFS using stack (first add root then move left and add upto null, when null add into list and move to right)
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                if (stack.isEmpty()) break;
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }

        return list;
    }
}