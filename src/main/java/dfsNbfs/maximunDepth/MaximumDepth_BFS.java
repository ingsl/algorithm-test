package dfsNbfs.maximunDepth;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode2 {
    int val;
    TreeNode2 left, right;
    TreeNode2(int x) {
        this.val = x;
    }
}
public class MaximumDepth_BFS {
    public static void main(String[] args) {
    TreeNode2 tree = new TreeNode2(3);
    tree.left = new TreeNode2(1);
    tree.right = new TreeNode2(4);
    tree.left.left = new TreeNode2(5);
    tree.left.right = new TreeNode2(8);
    tree.left.left.left = new TreeNode2(7);

    MaximumDepth_BFS mbfs = new MaximumDepth_BFS();

        System.out.println( mbfs.solve(tree) );
    }

    private int solve(TreeNode2 root) {
        if(root == null ) return 0;

        Queue<TreeNode2> queue = new LinkedList<>();
        queue.offer(root);
        int count =0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i =0; i < size; i++) {
                TreeNode2 node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                }if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            count ++;
        }

        return count;
    }

}
