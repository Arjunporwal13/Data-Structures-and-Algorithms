// Problem: Binary Tree In Order, Pre Order, and Post Order Traversal in one Traversal
// Platform: TakeUForward
// Approach: Iterative using Stack and a Pair class
// Time Complexity: O(3n)
// Space Complexity: O(4n)

class Pair {
    TreeNode node;
    int num;

    Pair (TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}
class Solution {
    List<List<Integer>> treeTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if (root == null) return new ArrayList<>();

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()) {
            Pair curr = stack.pop();

            if (curr.num == 1) {
                pre.add(curr.node.data);
                curr.num++;
                stack.push(curr);

                if (curr.node.left != null) {
                    stack.push(new Pair(curr.node.left, 1));
                }
            }
            else if (curr.num == 2) {
                in.add(curr.node.data);
                curr.num++;
                stack.push(curr);

                if (curr.node.right != null) {
                    stack.push(new Pair(curr.node.right, 1));
                }
            }
            else {
                post.add(curr.node.data);
            }
        }

        List<List<Integer>> list = new ArrayList<>();

        list.add(in);
        list.add(pre);
        list.add(post);

        return list;
    }
}