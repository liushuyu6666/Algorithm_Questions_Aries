package ZZTrashBin;

public class Valid_anagram {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int[] letter = new int[26];
        for(int i = 0; i < 26; i++) letter[i] = 0;

        for(int i = 0; i < s.length(); i++){
            letter[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i< t.length(); i++){
            letter[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(letter[i] != 0) return false;
        }
        return true;
    }

    public static void main(String args[]){
        String str1 = "rat", str2 = "car";

        Valid_anagram s = new Valid_anagram();
        System.out.println(s.isAnagram(str1, str2));
    }
}
