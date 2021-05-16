package ZZTrashBin;

public class Missing_number {
    public int missingNumber(int[] nums){
        int m = 0 ^ nums[0];
        for(int i = 1; i < nums.length; i++){
            m ^= i^nums[i];
        }
        return m^nums.length;
    }

    public int missingNumber2(int[] nums){
        int sum1 = 0, sum2 = 0, i = 0;
        for(i = 0; i < nums.length; i++){
            sum1 += nums[i];
            sum2 += i;
        }
        return sum2 + i - sum1;
    }

    public static void main(String args[]){
        Missing_number s = new Missing_number();
        System.out.println(s.missingNumber2(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
