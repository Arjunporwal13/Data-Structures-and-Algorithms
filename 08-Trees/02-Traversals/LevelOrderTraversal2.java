// Problem: Binary Tree Level Order Traversal (Reverse)
// Platform: LeetCode-107
// Approach: Iterative BFS (Used stack, we can also insert the elements at the 0th index to avoid stack)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return list;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sublist = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                sublist.add(curr.val);

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            list.add(sublist);
        }

        Stack<List<Integer>> stack = new Stack<>();

        for (List<Integer> sublist : list) {
            stack.push(sublist);
        }

        list.clear();

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        return list;
    }
}