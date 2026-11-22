// Problem: Binary Tree Inorder Traversal
// Platform: LeetCode-94
// Approach: Recursive DFS
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inorderUtil(list, root);

        return list;
    }
    private void inorderUtil(List<Integer> list, TreeNode root) {

        if (root == null) return;

        inorderUtil(list, root.left);
        list.add(root.val);
        inorderUtil(list, root.right);
    }
}