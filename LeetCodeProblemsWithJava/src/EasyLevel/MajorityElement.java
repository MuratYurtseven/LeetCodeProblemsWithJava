package EasyLevel;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            else{
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }

        int maxValue = Integer.MIN_VALUE;
        int maxKey = -1;


        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }


        return maxKey;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
