package ZZTrashBin;

import java.util.HashSet;
import java.util.Set;

public class Single_number {
    public int singleNumber(int[] nums){

        Set<Integer> set = new HashSet<>(nums.length);

        for(int x:nums){
            if(set.contains(x)) set.remove(x);
            else set.add(x);
        }

        return set.iterator().next();
    }

    public int singleNumber2(int[] nums){

        // bit manipulation
        int bit = 0;
        for(int x:nums){
            bit ^= x;
        }
        return bit;
    }

    public static void main(String args[]){
        int[] nums = {3, 4, 3, 5, 4};
        Single_number s = new Single_number();
        System.out.println(s.singleNumber2(nums));
    }
}
