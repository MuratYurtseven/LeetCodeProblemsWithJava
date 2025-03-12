package EasyLevel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> arr = new ArrayList<>();
        arr.add(root.val);
        arr.addAll(preorderTraversal(root.left));
        arr.addAll(preorderTraversal(root.right));
        System.out.println(arr);
        return arr;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        System.out.println(preorderTraversal(root));
    }

}
