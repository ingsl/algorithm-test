package stringNarray.moveZeros;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i=0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index <nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();

        int[] nums = {0,3,2,0,8,5};
        mz.moveZeroes(nums);

    }
}
