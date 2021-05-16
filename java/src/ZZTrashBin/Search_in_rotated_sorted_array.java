package ZZTrashBin;

public class Search_in_rotated_sorted_array {
    public int search(int[] nums, int target) {
        int leftBound = 0, rightBound = nums.length - 1, middle = (leftBound + rightBound) / 2;
        if (leftBound == rightBound && nums[leftBound] == target) return leftBound;
        if (leftBound == rightBound) return -1;
        return SearchTheSide(nums, leftBound, rightBound, target);
    }

    public int SearchTheSide(int[] nums, int leftBound, int rightBound, int target){
        if(rightBound - leftBound <= 1){
            if(target == nums[leftBound]) return leftBound;
            if(target == nums[rightBound]) return rightBound;
            else return -1;
        }
        int middle = (leftBound + rightBound) / 2;
        if(nums[middle] > nums[leftBound] && target >= nums[leftBound] && target <= nums[middle]){
            return SearchTheTarget(nums, leftBound, middle, target);
        }
        else if(nums[middle] > nums[leftBound]){
            return SearchTheSide(nums, middle, rightBound, target);
        }
        else if(nums[middle] < nums[rightBound] && target >= nums[middle] && target <= nums[rightBound]){
            return SearchTheTarget(nums, middle, rightBound, target);
        }
        else{
            return SearchTheSide(nums, leftBound, middle, target);
        }
    }

    public int SearchTheTarget(int[] nums, int leftBound, int rightBound, int target){
        int middle = (leftBound + rightBound) / 2;
        while(nums[leftBound] != target && nums[rightBound] != target && nums[middle] != target){
            if(target > nums[middle]){
                leftBound = middle;
                middle = (leftBound + rightBound) / 2;
                if(rightBound - leftBound <= 1) return -1;
            }
            else{
                rightBound = middle;
                middle = (leftBound + rightBound) / 2;
                if(rightBound - leftBound <= 1) return -1;
            }
        }
        if(nums[leftBound] == target) return leftBound;
        if(nums[rightBound] == target) return rightBound;
        if(nums[middle] == target) return middle;
        else return -1;
    }
}
