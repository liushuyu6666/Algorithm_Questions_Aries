package ZZTrashBin;

public class Find_peak_element {
    public int findPeakElement(int[] nums) {
        int[] boundNums = new int[nums.length+2];
        boundNums[0] = Integer.MIN_VALUE;
        boundNums[nums.length+1] = Integer.MIN_VALUE;
        for(int j = 0; j < nums.length; j++){
            boundNums[j+1] = nums[j];
        }
        int i = 0;
        for(i = 1; i < boundNums.length - 1; i++){
            if(boundNums[i] > boundNums[i-1] && boundNums[i] > boundNums[i+1]) return i-1;
        }
        return i - 2;
    }
    public static void main(String args[]){
        int[] nums = {-2147483648};
        Find_peak_element s = new Find_peak_element();
        s.findPeakElement(nums);
    }
}
