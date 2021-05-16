package ZZTrashBin;

import java.util.HashSet;
import java.util.Set;

public class Contain_Duplicate {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>(nums.length);

        for(int x:nums){
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;

    }

    public static void main(String args[]){
        int[] nums = {1, 2, 3, 4, 4};
        Contain_Duplicate s = new Contain_Duplicate();
        System.out.println(s.containsDuplicate(nums));
    }
}
