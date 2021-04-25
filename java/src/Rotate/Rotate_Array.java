package Rotate;

public class Rotate_Array {
    public void rotate(int[] nums, int k){
        k = k % nums.length;
        int cnt = 0, currPos, nextPos, prev, temp;
        for(int i = 0; cnt < nums.length; i++){
            currPos = i;
            nextPos = (currPos + k) % nums.length;
            prev = nums[currPos];
            do{
                temp = nums[nextPos];
                nums[nextPos] = prev;
                prev = temp;
                currPos = nextPos;
                nextPos = (currPos + k) % nums.length;
                cnt++;
            }while(currPos != i);
        }
    }

    public static void main(String args[]){
        int nums1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 11};
        Rotate_Array s = new Rotate_Array();
        s.rotate(nums1, 3);

        for(int i = 0; i<nums1.length; i++){
            System.out.println(nums1[i]);
        }
    }
}
