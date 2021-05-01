package DataStructure;

import java.util.Arrays;
import java.util.List;

public class Basic_Array {
    public static void main(String args[]){

        // 1, new
        int[] array = new int[]{3, 1, 2, 2};

        // 2, sort
        Arrays.sort(array); // sort in-place
        System.out.println("sorted array:");
        for(int a:array) System.out.println(a);

        // 3, convert
        List<Integer> converted = Arrays.asList(1, 2, 3);
        System.out.println(converted);
    }
}
