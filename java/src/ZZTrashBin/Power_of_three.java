package ZZTrashBin;

public class Power_of_three {
    public boolean isPowerOfThree(int n){

        // base conversion
        String num = Integer.toString(n, 3);
        return num.matches("^10*$");
    }

    public static void main(String args[]){
        Power_of_three s = new Power_of_three();
        System.out.println(s.isPowerOfThree(28));
    }
}
