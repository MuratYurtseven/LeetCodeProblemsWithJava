package EasyLevel;
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
*/
public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int rootLeft = maxDepth(root.left);
        int rootRight = maxDepth(root.right);
        return Math.max(rootLeft,rootRight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);

        System.out.println(maxDepth(root));
    }
}
