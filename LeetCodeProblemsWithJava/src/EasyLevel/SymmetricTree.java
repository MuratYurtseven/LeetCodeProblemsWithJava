package EasyLevel;

import java.util.Stack;
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
public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return dfs(root.left,root.right);
    }


    public static boolean dfs(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null || left.val != right.val ){
            return false;
        }
        return dfs(left.left,right.right)  && dfs(left.right,right.left);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        if (isSymmetric(root))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
