package BinarySearch;

public class Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while(left < right){
            mid = (left + right) / 2;
            if(nums[mid] == target) return true;
                // left is pure
            else if(nums[left] < nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                    System.out.println(left + ":" + right);
                }
                else{
                    left = mid + 1;
                    System.out.println(left + ":" + right);
                }
            }
            // right is pure
            else if(nums[mid] < nums[right]){
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                    System.out.println(left + ":" + right);
                }
                else{
                    right = mid - 1;
                    System.out.println(left + ":" + right);
                }
            }
            // nums[mid] = nums[left]
            else if(nums[left] == nums[mid]){
                left++;
            }
            else{
                right--;
            }
        }
        if(nums[left] == target) return true;
        else return false;
    }
}
