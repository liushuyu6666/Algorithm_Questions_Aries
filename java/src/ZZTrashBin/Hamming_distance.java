package ZZTrashBin;

public class Hamming_distance {
    public int hammingDistance(int x, int y){
        int add = x^y, sum = 0;
        while(add != 0){
            add &= add - 1;
            sum++;
        }
        return sum;
    }

    public static void main(String args[]){
        Hamming_distance s = new Hamming_distance();
        System.out.println(s.hammingDistance(1, 4));
    }
}
