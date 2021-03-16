package stringNarray.plusOne;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9,9,9};

        PlusOne plusOne = new PlusOne();

        digits = plusOne.solve(digits);

         for(int i : digits) {
             System.out.println(i);
         }
    }

    public int[] solve(int[] digits) {

        int index  = digits.length-1;
        int carry = 1;

        while(index >=0 && carry > 0) {

            digits[index] = (digits[index]+1) % 10;

            if(digits[index] == 0) {
                carry =1;
            } else {
                carry =0;
            }
            -- index;
        }

        if(carry == 1) {
            digits = new int[digits.length+1];
            digits[0] = 1;
        }

        return digits;
    }
}
