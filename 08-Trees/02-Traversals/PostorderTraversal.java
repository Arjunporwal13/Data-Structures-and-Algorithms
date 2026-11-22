// Problem: Binary Tree Postorder Traversal
// Platform: LeetCode-145
// Approach: Recursive DFS
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        postorderUtil(list, root);

        return list;
    }
    private void postorderUtil(List<Integer> list, TreeNode root) {

        if (root == null) return;

        postorderUtil(list, root.left);
        postorderUtil(list, root.right);
        list.add(root.val);
    }
}