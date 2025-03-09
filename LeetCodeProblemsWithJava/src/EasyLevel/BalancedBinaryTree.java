package EasyLevel;

public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        if (height(root) == -1) return false;
        return true;
    }

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight == -1 || rightHeight == - 1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1)return -1;

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static void main(String[] args) {
        /*TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);*/


        /*TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);*/

        /*TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);*/

        /*TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);*/

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.right.right = new TreeNode(6);


        System.out.println(isBalanced(root));
    }
}
