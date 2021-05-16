package ZZTrashBin;


public class First_unique_character_in_string {
    public int firstUniqChar(String s){
        // !! avoid s = "";
        if(s.length() < 1) return -1;

        char c;
        int[] letter = new int[26]; // record the freq of each letter.
        for(int i = 0; i < 26; i++) letter[i] = 0;

        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            // !! should be c - 'a' not c
            letter[c -'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(letter[c -'a'] == 1) return i;
        }

        return -1;
    }

    public static void main(String args[]){
        String str = "dddccdbba";
        First_unique_character_in_string s = new First_unique_character_in_string();
        System.out.println(s.firstUniqChar(str));
    }
}
