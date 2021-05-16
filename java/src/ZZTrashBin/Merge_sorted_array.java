package ZZTrashBin;

public class Merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        if(n == 0) return;
        int p = m + n - 1;
        int i = m - 1, j = n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[p] = nums1[i];
                p--;
                i--;
            }
            else{
                nums1[p] = nums2[j];
                p--;
                j--;
            }
        }

        if(i < 0){
            while(j >= 0){
                nums1[p] = nums2[j];
                p--;
                j--;
            }
        }
    }

    public static void main(String args[]){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        Merge_sorted_array s = new Merge_sorted_array();
        s.merge(nums1, nums1.length, nums2, nums2.length);

        for(int x: nums1){
            System.out.println(x);
        }
    }
}
