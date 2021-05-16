package ZZTrashBin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_combinations_of_a_phone_number {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> keyboard = new HashMap<>();
        keyboard.put('2', "abc");
        keyboard.put('3', "def");
        keyboard.put('4', "ghi");
        keyboard.put('5', "jkl");
        keyboard.put('6', "mno");
        keyboard.put('7', "pqrs");
        keyboard.put('8', "tuv");
        keyboard.put('9', "wxyz");
        List<String> ans = new ArrayList<>();

        for(int i = 0 ; i < digits.length(); i++){
            String stringA = keyboard.get(digits.charAt(i));
            ans = union(stringA, ans);
        }
        return ans;
    }

    public List<String> union(String stringA, List<String> container){
        List<String> ans = new ArrayList<>();
        if(container.size() == 0){
            for(int i = 0; i < stringA.length(); i++){
                ans.add(Character.toString(stringA.charAt(i)));
            }
        }
        else{
            for(int j = 0; j < container.size(); j++){
                for(int i = 0; i < stringA.length(); i++){
                    ans.add(container.get(j) + Character.toString(stringA.charAt(i)));
                }
            }
        }
        return ans;
    }
}
