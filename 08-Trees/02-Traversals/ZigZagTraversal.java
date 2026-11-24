// Problem: Binary Tree Zig Zag Traversal
// Platform: LeetCode-103
// Approach: Iterative BFS with a flag
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sublist = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (flag == false) {
                    sublist.add(curr.val);
                }
                else {
                    sublist.add(0, curr.val);
                }

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            if (flag == false) flag = true;
            else flag = false;

            list.add(sublist);
        }

        return list;
    }
}