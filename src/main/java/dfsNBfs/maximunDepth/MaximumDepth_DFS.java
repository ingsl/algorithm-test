package dfsNBfs.maximunDepth;

import java.util.Stack;

public class MaximumDepth_DFS {

    public static void main(String[] args) {
        TreeNode1 tree = new TreeNode1(3);
        tree.left = new TreeNode1(1);
        tree.right = new TreeNode1(4);
        tree.left.left = new TreeNode1(5);
        tree.left.right = new TreeNode1(8);
        tree.left.left.left = new TreeNode1(7);

        MaximumDepth_DFS mdDfs = new MaximumDepth_DFS();
        System.out.println(mdDfs.dfs(tree));
    }

    public int dfs(TreeNode1 tree) {
        int max =0;
        if(tree == null) return max;

        Stack<TreeNode1> stack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();

        stack.push(tree);
        valueStack.push(1);

        while (!stack.isEmpty()) {
            TreeNode1 node = stack.pop();
            int count = valueStack.pop();
            max = Math.max(max, count);

            if(node.left !=null) {
                stack.push(node.left);
                valueStack.push(1+count);
            }

            if(node.right != null) {
                stack.push(node.right);
                valueStack.push(1+count);
            }
        }

        return max;
    }
}

class TreeNode1 {
    int val;
    TreeNode1 left, right;
    TreeNode1(int x) {
        this.val = x;
    }
}
