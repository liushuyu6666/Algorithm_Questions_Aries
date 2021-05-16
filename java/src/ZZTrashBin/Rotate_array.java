package ZZTrashBin;

public class Rotate_array {
    public void rotate(int[] nums, int k){
        if(k == 0){return;}
        if(nums.length == 1 || nums.length == k){return;}

        int prevPos, curPos, temp, count = 0;
        for(int i = nums.length - 1; count < nums.length; i--){
            curPos = i;
            while(curPos != (i + k) % nums.length){
                prevPos = (curPos - k) % nums.length;
                if(prevPos < 0) prevPos = prevPos + nums.length;
                temp = nums[prevPos];
                nums[prevPos] = nums[curPos];
                nums[curPos] =temp;
                curPos = prevPos;
                count ++;
            }
            count ++;
        }
    }
    public static void main(String args[]){
//        int nums1[] = {1, 2, 3, 4, 5, 6};
        int nums1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 11};
//        int nums1[] = {1, 2, 3, 4, 5, 6};
        Rotate_array s = new Rotate_array();
        s.rotate(nums1, 3);

        for(int i = 0; i<nums1.length; i++){
            System.out.println(nums1[i]);
        }
//        System.out.println(s.maxProfit(nums2));
//        System.out.println(s.maxProfit(nums3));
    }
}
