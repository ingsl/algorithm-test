package dfsNBfs.maximunDepth;

public class MaximumDepth_recursive {
    //트리의 맥스뎁스 구하기
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);

        MaximumDepth_recursive mdr = new MaximumDepth_recursive();
        System.out.println(mdr.maxDepth(tree));
    }

    public int maxDepth(TreeNode treeNode) {
        if(treeNode == null) return 0;

        int leftMax = maxDepth(treeNode.left);
        int rightMax = maxDepth(treeNode.right);

        return Math.max(leftMax, rightMax)+1;
    }
}

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        this.val = x;
    }
}
