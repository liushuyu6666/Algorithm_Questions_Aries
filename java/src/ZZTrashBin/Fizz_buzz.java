package ZZTrashBin;

import java.util.ArrayList;
import java.util.List;

public class Fizz_buzz {
    public List<String> fizzBuzz(int n){
        List<String> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){
                ans.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                ans.add("Fizz");
            }
            else if(i % 5 == 0){
                ans.add("Buzz");
            }
            else ans.add(String.valueOf(i));
        }

        return ans;
    }

    public static void main(String args[]){
        Fizz_buzz s = new Fizz_buzz();

    }
}
