package BitManipulation;

public class Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        int curr = a ^ b;
        int carry = (a & b) << 1;
        if(carry != 0){
            return getSum(curr, carry);
        }
        return curr;
    }

    public static void main(String args[]){
        Sum_of_Two_Integers sum_of_two_integers = new Sum_of_Two_Integers();
        System.out.println(sum_of_two_integers.getSum(3, 17));
    }
}
