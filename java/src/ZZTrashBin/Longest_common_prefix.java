package ZZTrashBin;

public class Longest_common_prefix {
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        char ch = ' ';
        int j = 0;

        while(true) {
            for (int i = 0; i < strs.length; i++) {
                if (i == 0 && j < strs[0].length()) {
                    ch = strs[0].charAt(j);
                }
                else if (j < strs[i].length() && strs[i].charAt(j) != ch) {
                    return strs[0].substring(0, j);
                }
                else if(j == strs[i].length()) return strs[0].substring(0, j);
            }
            j++;
        }
    }

    public static void main(String args[]){
        String[] strs = {"dog", "racecar", "car"};
        Longest_common_prefix s = new Longest_common_prefix();
        System.out.println(s.longestCommonPrefix(strs));
    }
}
