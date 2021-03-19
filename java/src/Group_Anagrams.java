import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Group_Anagrams {
    // w.len >= 1
    public Long uniquePrimeMultiplication(String w){
        HashMap<Character, Integer> prime = new HashMap<>();
        prime.put('a', 2);
        prime.put('b', 3);
        prime.put('c', 5);
        prime.put('d', 7);
        prime.put('e', 11);
        prime.put('f', 13);
        prime.put('g', 17);
        prime.put('h', 19);
        prime.put('i', 23);
        prime.put('j', 29);
        prime.put('k', 31);
        prime.put('l', 37);
        prime.put('m', 41);
        prime.put('n', 43);
        prime.put('o', 47);
        prime.put('p', 53);
        prime.put('q', 59);
        prime.put('r', 61);
        prime.put('s', 67);
        prime.put('t', 71);
        prime.put('u', 73);
        prime.put('v', 79);
        prime.put('w', 83);
        prime.put('x', 89);
        prime.put('y', 97);
        prime.put('z', 101);
        Long product = new Long(1);
        for(int i = 0; i < w.length(); i++){
            product = prime.get(w.charAt(i)) * product;
        }
        return product;
    }

    public List<List<String>> groupAnagrams(String[] strs){
        if(strs.length < 1) return new ArrayList<>();
        HashMap<Long, List<String>> ans = new HashMap<>();
        for(String words : strs){
            Integer wild = words.length();
            Long eigenvalue = this.uniquePrimeMultiplication(words);
            if(ans.containsKey(eigenvalue)){
                ans.get(eigenvalue).add(words);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(words);
                ans.put(eigenvalue, l);
            }
        }
        return new ArrayList<>(ans.values());
    }

    public static void main(String args[]){
        Group_Anagrams group_anagrams = new Group_Anagrams();
        String[] strs = {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        System.out.println(group_anagrams.groupAnagrams(strs));
    }
}
