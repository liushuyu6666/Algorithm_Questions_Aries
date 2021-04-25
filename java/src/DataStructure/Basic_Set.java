package DataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Basic_Set {
    public static void main(String args[]){

        // 1, new
        Set<Integer> set1 = new HashSet<>();

        // 2, array to set
        int[] array = new int[]{1, 2, 10, 10};
        Integer[] arrayInteger = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            arrayInteger[i] = array[i];
        }
        set1.addAll(Arrays.asList(arrayInteger));

        System.out.println("set1 is " + set1);

        // 3, add to set
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < 5; i++){
            set2.add(i);
        }
        System.out.println("set2 is " + set2);

        // 4, union of two sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union is " + union);

        // 5, intersection of two sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection is " + intersection);

        // 6, contains
        System.out.println("if contains 1: " + set1.contains(1));
    }
}
