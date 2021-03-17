package stringNarray.maxiumSubArray;

public class MaxiumSubArray {

    public static void main(String[] args) {
        MaxiumSubArray maxiumSubArray = new MaxiumSubArray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println( maxiumSubArray.solve(nums) );
    }

    private int solve(int[] nums) {

       int newSum =nums[0], maxNum =nums[0];

       for(int i=1; i<nums.length;i++) {
            newSum = Math.max(nums[i], newSum+nums[i]);
            maxNum = Math.max(maxNum, newSum);
        }
        return maxNum;

        }

}
