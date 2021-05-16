package ZZTrashBin;

public class Search_for_a_range {
    public int[] searchRange(int[] nums, int target) {
        int[] dead = new int[] {-1, -1};
        if(nums.length < 1) return dead;
        if(nums.length == 1){
            if(nums[0] == target) return new int[] {0,0};
            else return dead;
        }
        if(nums.length == 2){
            if(nums[0] == nums[1] && nums[0] == target) return new int[] {0, 1};
            if(nums[0] == target) return new int[] {0,0};
            if(nums[1] == target) return new int[] {1,1};
            else return dead;
        }
        int hit = nums.length / 2, leftBound = 0, rightBount = nums.length;
        while(nums[hit] != target){
            if(nums[hit] > target){
                if(rightBount == hit) return dead;
                rightBount = hit;
                hit = (hit + leftBound) / 2;
            }
            else{
                if(leftBound == hit) return dead;
                leftBound = hit;
                hit = (hit + rightBount) / 2;
            }
        }
        // hit the target
        // find the left
        int left = hit;
        while(left>=0&&nums[left]==target){
            left--;
        }
        left++;
        // find the right
        int right = hit;
        while(right<nums.length&&nums[right]==target){
            right++;
        }
        right--;
        return new int[] {left, right};
    }
    public static void main(String args[]){
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        Search_for_a_range s = new Search_for_a_range();
        System.out.println(s.searchRange(nums, target));
    }
}
