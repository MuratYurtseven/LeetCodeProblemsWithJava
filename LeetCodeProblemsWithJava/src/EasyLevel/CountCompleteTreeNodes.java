package EasyLevel;

public class CountCompleteTreeNodes {

    public static int countRoot(TreeNode root){
        if (root == null) return 1;
        int left = countRoot(root.left);
        int right = countRoot(root.right);
        return left+right;
    }

    public static int countNodes(TreeNode root) {
        return countRoot(root) - 1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        //root.right.left = new TreeNode(7);

        System.out.println(countNodes(root));
    }
}
