package MoveInArray;

public class Remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums){
        if(nums.length < 2){
            return 1;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        Remove_duplicates_from_sorted_array s = new Remove_duplicates_from_sorted_array();
        int size = s.removeDuplicates(nums);
        System.out.println(nums.length);
    }
}

