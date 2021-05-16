package ZZTrashBin;

import java.util.HashMap;

public class Roman_to_Integer {
    public int romanToInt(String s){
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int max = 0, curr, sum = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            curr = roman.getOrDefault(s.charAt(i), 0);
            // IV, max is V, curr is I
            if(curr < max){
                sum -= curr;
            }
            // VII
            else{
                max = roman.getOrDefault(s.charAt(i), 0);
                sum += curr;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        Roman_to_Integer s = new Roman_to_Integer();
        System.out.println(s.romanToInt("III"));
        System.out.println(s.romanToInt("IV"));
        System.out.println(s.romanToInt("IX"));
        System.out.println(s.romanToInt("LVIII"));
    }
}
