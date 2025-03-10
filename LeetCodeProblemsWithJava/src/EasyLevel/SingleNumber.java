package EasyLevel;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        int singleNumber = 0;
        for (int num:nums){
            singleNumber ^= num;
        }

        return singleNumber;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
}
