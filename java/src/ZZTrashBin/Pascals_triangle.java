package ZZTrashBin;

import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle {
    public List<List<Integer>> generate(int numRows){
        if(numRows < 1) return new ArrayList<>();

        // initialization
        List<List<Integer>> tri = new ArrayList<>();
        List<Integer> angle = new ArrayList<>(1);
        angle.add(1);
        tri.add(angle);
        if(numRows < 2) return tri;

        // 2 and more
        for(int i = 2; i < numRows + 1; i++){
            angle = new ArrayList<>(numRows);
            for(int j = 0; j < i; j++){
                if(j == 0){
                    angle.add(1);
                }
                else if(j == i - 1){
                    angle.add(1);
                    tri.add(angle);
                }
                else{
                    angle.add(tri.get(i - 2).get(j) + tri.get(i - 2).get(j - 1));
                }
            }
        }

        return tri;
    }

    public static void main(String args[]){
        Pascals_triangle s = new Pascals_triangle();
        List<List<Integer>> triangle = s.generate(5);
        for(List<Integer> layer:triangle){
            System.out.println(layer.toString());
        }
    }
}
