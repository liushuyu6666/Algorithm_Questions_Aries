package MoveInArray;

public class Move_zeros {
    public void moveZeros(int[] nums){
        int j = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 && j != -1){
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
            else if(nums[i] == 0 && j == -1){
                j = i;
            }
        }
    }

    public static void main(String args[]){
        int[] nums = {1, 2, 0, 0, 3, 4, 0, 5, 0, 0,};
        Move_zeros s = new Move_zeros();
        s.moveZeros(nums);
        for(int x: nums) System.out.println(x);
    }
}
