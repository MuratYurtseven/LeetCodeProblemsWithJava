package EasyLevel;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicatesFromSortedArray(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesFromSortedArray(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
