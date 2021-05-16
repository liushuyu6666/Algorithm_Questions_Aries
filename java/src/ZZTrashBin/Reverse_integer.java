package ZZTrashBin;

public class Reverse_integer {
    public int reverse(int x){
        int leftRange = (int) Math.pow(-2, 31), rightRange = 2147483647;
        int sym = ((x<0)? -1: 1);
        int reverse = (x % 10);
        int remain = x / 10;
        while(remain != 0){
            // judge if reverse * 10 beyond the range
            // judge if reverse * 10 + remain % 10 < leftRange || reverse * 10 + remain % 10 > rightRange
            if(sym < 0){
                if(reverse < leftRange / 10 || reverse * 10 < leftRange - remain % 10) return 0;
            }
            else if(sym > 0){
                if(reverse > rightRange / 10 || reverse * 10 - rightRange > - remain % 10) return 0;
            }

            reverse = reverse * 10 + remain % 10;
            remain = remain / 10;
        }
        return reverse;
    }

    public static void main(String args[]){
        int num = -2147483412;
        Reverse_integer s = new Reverse_integer();
        System.out.println(s.reverse(num));
    }
}
