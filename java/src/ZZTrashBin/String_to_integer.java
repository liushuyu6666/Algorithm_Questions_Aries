package ZZTrashBin;

public class String_to_integer {
    public int myAtoi(String str){
        int i = 0, sym = 1;
        long sum = 0;
        boolean noDigitAhead = true;

        while(i < str.length() && str.charAt(i) == ' '){
            i++;
        }

        // symbol here
        if(i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')){
            if(str.charAt(i) == '+') sym = 1;
            else sym = -1;
            i++;
        }

        while(i < str.length() && Character.isDigit(str.charAt(i))){
            sum = sum * 10 + Character.getNumericValue(str.charAt(i));
            if(sum * sym > (long)Integer.MAX_VALUE) return (int) Integer.MAX_VALUE;
            else if(sum * sym < (long)Integer.MIN_VALUE) return (int) Integer.MIN_VALUE;
            i++;
        }


        return (int) (sym * sum);
    }

    public static void main(String args[]){
        String num = "9223372036854775808";
        String_to_integer s = new String_to_integer();
        System.out.println(s.myAtoi(num));
    }
}
