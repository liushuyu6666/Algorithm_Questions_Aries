package ZZTrashBin;

public class Implement_strstr {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0 || needle.length() == 0){
            if(needle.length() == 0) return 0;
            else return -1;
        }

        // KMP
        int [] lps = new int[needle.length()];
        lps[0] = 0;
        int i = 0, j;

        // lps
        j = 1;

        while(j < needle.length()){
            if(needle.charAt(i) == needle.charAt(j)){
                lps[j] = i + 1;
                j++;
                i++;
            }
            else{
                // if i - 1 is still in the first repeat part, that means i - 1 == lps[i - 1] and
                // needle[j - 1] == needle[i - 1], so needle[j - 1] is also in the repeat part
                // 1) needle[j] == needle[i - 1]
                if(i > 0 && i - 1 == lps[i - 1]){
                    if(needle.charAt(i - 1) == needle.charAt(j)){
                        i--;
                    }
                    else{
                        i = 0;
                    }
                }
                // if i - 1 is not in the first repeat part:
                // 1) if i == 0, lps[j] = 0
                // 2) if i != 0, i = 0;
                else{
                    if(i == 0){
                        lps[j] = 0;
                        j++;
                    }
                    else i = 0;
                }
            }
        }

        i = 0; j = 0;
        while(i < haystack.length()){
            // !! also need to check if i < haystack.length()
            while(j < needle.length() && i < haystack.length() && haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            if(j == needle.length()){
                return i - needle.length();
            }
            else{
                if(j != 0){
                    i = i - lps[j-1];
                    j = 0;
                }
                else{
                    i++;
                    j = 0;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String haystack = "";
        String needle = "";
        Implement_strstr s = new Implement_strstr();
        System.out.println(s.strStr(haystack, needle));

    }
}
