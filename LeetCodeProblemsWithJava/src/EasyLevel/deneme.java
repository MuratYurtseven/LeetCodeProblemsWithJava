package EasyLevel;

public class deneme {


    public static int maxDeepth(TreeNode root){
        if (root == null) return 0;

        if(root.left == null && root.right == null){
            return 1;
        }
        return Height(root);
    }

    public static int Height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lH = Height(root.left);
        int rH = Height(root.right);
        if(root.left == null) return lH+1;
        if (root.right == null) return rH+1;
        return Math.max(lH,rH) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
        root.right.right.right.right = new TreeNode(5);
        root.right.right.right.right.right = new TreeNode(6);

        System.out.println(maxDeepth(root));

    }
}
