package ZZTrashBin;

public class TEST_BinarySearch {
    // crucial:
    // leftBound always point to the element smaller than target
    // rightBound always point to the element larger than target
    public boolean binarySearch(int[] nums, int leftBound, int rightBound, int target){
        if(nums.length < 1) return false;

        // first, and crucial:
        // ensure that leftBound always point to the element smaller than target
        // ensure that rightBound always point to the element smaller than target
        if(nums[leftBound] > target || nums[rightBound] < target) return false;
        if(nums[leftBound] == target || nums[rightBound] == target) return true;

        // second
        // move the bound
        // stop when rightBound meets with leftBound
        int middle = (leftBound + rightBound) / 2;
        while(rightBound - leftBound >= 2){
            if(nums[middle] == target || nums[leftBound] == target || nums[rightBound] == target) return true;
            // move
            if(nums[middle] > target){
                rightBound = middle;
                middle = (leftBound + rightBound) / 2;
            }
            else if(nums[middle] < target){
                leftBound = middle;
                middle = (leftBound + rightBound) / 2;
            }
        }
        // leftBound always point to the smaller element,
        // meanwhile rightBound points to the larger position,
        // when they meet together, indicating that there is no space for the target.
        return false;
    }

    public static void main(String args[]){
        int[] nums = {1, 1, 2, 5, 5, 8, 9, 12, 15};
        TEST_BinarySearch bs = new TEST_BinarySearch();
        System.out.println(bs.binarySearch(nums, 0, nums.length - 1, 5));
    }
}
