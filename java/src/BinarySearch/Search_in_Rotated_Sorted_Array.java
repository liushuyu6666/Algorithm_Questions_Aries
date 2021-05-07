package BinarySearch;

public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target){
        int left = 0, right = nums.length - 1, mid;
        while(left < right){
            mid = (left + right) / 2;
            // [left, mid] is pure
            if(nums[left] < nums[mid]){
                if(target == nums[mid]) return mid;
                else if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            // (mid - rigth] is pure
            else{
                mid = mid + 1;
                if(target == nums[mid]) return mid;
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                    // if(left == (left + right) / 2) break;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        if(left < nums.length && nums[left] == target) return left;
        return -1;
    }
}
