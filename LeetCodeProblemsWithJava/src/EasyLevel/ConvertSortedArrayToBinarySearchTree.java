package EasyLevel;

import java.util.Arrays;

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
public class ConvertSortedArrayToBinarySearchTree {

    public static TreeNode recursiveSortedArrayBST(int [] nums,int start,int end){
        if(start>end){
            return null;
        }
        int middle = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = recursiveSortedArrayBST(nums,start,middle-1);
        root.right = recursiveSortedArrayBST(nums,middle+1,end);
        return root;
    }



    public static TreeNode sortedArrayToBST(int[] nums) {
        return recursiveSortedArrayBST(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
    }
}
