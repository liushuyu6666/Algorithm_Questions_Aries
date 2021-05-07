package BinarySearch;

public class Search_for_a_Range {
    public int[] searchRange(int[] nums, int target){
        int[] none = new int[]{-1, -1};
        if(nums.length < 1) return none;
        int start = binarySearch(nums, target), end = binarySearch(nums, target + 1);
        if(start == end) return none;
        else return new int[]{start, end-1};

    }
    public int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length, mid;
        while(left < right){
            mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}
