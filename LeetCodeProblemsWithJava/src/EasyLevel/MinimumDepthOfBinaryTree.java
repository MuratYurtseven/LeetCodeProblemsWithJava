package EasyLevel;

public class MinimumDepthOfBinaryTree {

    public static int minDepth(TreeNode root) {

        if (root == null) return 0;
        if(root.left == null && root.right == null){
            return 1;
        }
        return height(root);
    }

    public static int height(TreeNode root){
        if (root == null) return 0;
        int leftRoot = height(root.left);
        int rightRoot = height(root.right);

        if (root.left == null){
            return 1 + rightRoot;
        }
        if (root.right == null){
            return 1 + leftRoot;
        }

        return Math.min(leftRoot,rightRoot) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);

        System.out.println(minDepth(root));
    }
}
