package stringNarray.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for(int i=0; i < nums.length;i++) {
            if(map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int nums[] = {0,4,3,0};
        int target = 0;

        twoSum.twoSum(nums, target);
    }
}
