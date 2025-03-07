package EasyLevel;

import java.util.Arrays;

public class MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0; i<n; i++) {
            nums1[m+i] = nums2[i];
        }

        return nums1;
    }

    public static void main(String[] args) {
        int [] result = merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6},3);
        System.out.println(Arrays.toString(result));
    }
}
