package ZZTrashBin;

public class Longest_increasing_subsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length < 2) return 1;
        int[] aux = new int[nums.length];
        aux[0] = nums[0];
        int maxLen = 1, rightBound, leftBound;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > aux[maxLen - 1]){
                aux[maxLen] = nums[i];
                maxLen++;
            }
            else{
                leftBound = 0; rightBound = maxLen - 1;
                aux = binarySearch(aux, leftBound, rightBound, nums[i]);
            }
        }
        return maxLen;
    }
    public int[] binarySearch(int[] aux, int leftBound, int rightBound, int target){
        if(aux[leftBound] > target){
            aux[leftBound] = target;
            return aux;
        }
        int middle = (leftBound + rightBound) / 2;
        while(rightBound - leftBound >= 2){

            if(aux[middle] == target || aux[leftBound] == target || aux[rightBound] == target) return aux;
            if(aux[middle] > target){
                rightBound = middle;
                middle = (leftBound + rightBound) / 2;
            }
            else{

                leftBound = middle;
                middle = (leftBound + rightBound) / 2;
            }
        }
        aux[rightBound] = target;
        return aux;
    }
    public static void main(String args[]){
        Longest_increasing_subsequence s = new Longest_increasing_subsequence();
        int[] nums = {4,10,4,3,8,9};
        s.lengthOfLIS(nums);
    }
}
