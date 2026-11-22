// Problem: Binary Tree Preorder Traversal
// Platform: LeetCode-144
// Approach: Recursive DFS
// Time Complexity: O(n)
// Space Complexity: O(h)

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        preorderUtil(list, root);

        return list;
    }
    private void preorderUtil(List<Integer> list, TreeNode root) {

        if (root == null) return;

        list.add(root.val);
        preorderUtil(list, root.left);
        preorderUtil(list, root.right);
    }
}