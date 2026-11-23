// Problem: Binary Tree Level Order Traversal
// Platform: LeetCode-102
// Approach: Iterative BFS
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return list;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sublist = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
                sublist.add(curr.val);
            }

            list.add(sublist);
        }

        return list;
    }
}