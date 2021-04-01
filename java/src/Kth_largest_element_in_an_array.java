import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kth_largest_element_in_an_array {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> numList = new ArrayList<>();
        for(int num : nums){
            numList.add(num);
        }
        Collections.sort(numList);
        Collections.reverse(numList);
        return numList.get(k-1);
    }
}
