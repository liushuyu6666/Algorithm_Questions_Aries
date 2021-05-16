package ZZTrashBin;

public class Number_of_1_bits {
    public int hammingWeight(int n){
        int digit = 0;
        while(n != 0){
            n &= (n - 1);
            digit++;
        }
        return digit;
    }

    public static void main(String args[]){
        Number_of_1_bits s = new Number_of_1_bits();
        System.out.println(s.hammingWeight(4));
    }
}
