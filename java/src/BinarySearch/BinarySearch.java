package BinarySearch;

public class BinarySearch {

    public int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length, mid;
        // left searches for target or the smallest value that larger than the target continuously
        // right indicates the right bound of the possible area
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

    public static void main(String args[]){
        int[] nums = new int[]{1, 2};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(nums, 0));
    }
}
