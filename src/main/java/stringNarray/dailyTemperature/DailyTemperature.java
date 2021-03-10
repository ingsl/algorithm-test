package stringNarray.dailyTemperature;

import java.util.Stack;

public class DailyTemperature {
    public static int[] dailyTemperatures(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];

        for (int i=0; i < nums.length; i++) {
            while(!stack.empty() && nums[stack.peek()] < nums[i]) {

                System.out.println(stack);
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(nums);

        for (int i : res) {
            //System.out.println(i  + "  ");
        }
    }
}
