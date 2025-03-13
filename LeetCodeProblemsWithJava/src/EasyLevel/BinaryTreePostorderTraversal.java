package EasyLevel;

import java.util.*;

public class BinaryTreePostorderTraversal {

    public static void trv(TreeNode root,List<Integer> arr){
        if(root != null){
            trv(root.left,arr);
            trv(root.right,arr);
            arr.add(root.val);
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        trv(root,arr);
        return arr;
    }




    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        System.out.println(postorderTraversal(root));

    }
}
