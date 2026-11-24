// Problem: Binary Tree Preorder Traversal
// Platform: LeetCode-144
// Approach: Iterative DFS, using 1 stack
// Time Complexity: O(2n)
// Space Complexity: O(n)

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    list.add(temp.val);

                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        list.add(temp.val);
                    }
                }
                else {
                    curr = temp;
                }
            }
        }

        return list;
    }
}