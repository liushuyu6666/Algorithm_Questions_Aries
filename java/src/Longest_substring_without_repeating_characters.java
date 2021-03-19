import java.util.HashMap;

public class Longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s){
        int ans = 0;
        HashMap<Character, Integer> dict = new HashMap<>(); // nearest redundant character table
        for(int i = 0, j = 0; j < s.length(); j++){
            if(dict.containsKey(s.charAt(j))){
                i = Math.max(i, dict.get(s.charAt(j)));
            }
            dict.put(s.charAt(j), j+1); // update the table
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
    public static void main(String args[]){
        Longest_substring_without_repeating_characters s =
                new Longest_substring_without_repeating_characters();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }
}
