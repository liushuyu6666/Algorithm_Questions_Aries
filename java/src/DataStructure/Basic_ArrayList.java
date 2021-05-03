package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic_ArrayList {
    public static void main(String args[]){

        // 1, new
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list);

        // 2, subList
        List<Integer> subList = list.subList(0, 3);
        System.out.println(subList);
    }
}
