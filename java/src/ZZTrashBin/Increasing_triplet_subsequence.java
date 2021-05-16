package ZZTrashBin;

public class Increasing_triplet_subsequence {
    public boolean increasingTriplet(int[] nums){
        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > min && nums[i] < mid) mid = nums[i];
            if(nums[i] > mid) return true;
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums = {2,1,5,0,4,6};
        Increasing_triplet_subsequence s = new Increasing_triplet_subsequence();
        System.out.println(s.increasingTriplet(nums));
    }
}
