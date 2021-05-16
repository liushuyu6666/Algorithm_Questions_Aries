package ZZTrashBin;

import java.util.Arrays;

public class Plus_one {
    public int[] plusOne(int[] digits){
        Boolean carry = true;
        int[] ans = new int[digits.length + 1];
        int index = digits.length;
        for(int i = digits.length - 1; i >= 0; i --){
            if(carry){
                carry = ((digits[i] + 1) / 10 == 1);
                ans[index] = (digits[i] + 1) % 10;
                index--;
            }
            else{
                ans[index] = digits[i];
                index--;
            }
        }
        if(carry){
            ans[index] = 1;
            return Arrays.copyOfRange(ans, 0, digits.length + 1);
        }
        return Arrays.copyOfRange(ans, 1, digits.length + 1);
    }

    public static void main(String args[]){
        int[] nums = {9, 9, 7, 9};
        Plus_one s = new Plus_one();
        int[] solution = s.plusOne(nums);
        for(int x:solution) System.out.println(x);
    }

}
