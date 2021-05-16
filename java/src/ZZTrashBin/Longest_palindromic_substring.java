package ZZTrashBin;

public class Longest_palindromic_substring {
    public String longestPalindrome(String s){
        if(s.length() < 1) return "";
        int maxLen = 0;
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            String oddString = this.palindromeLength(s, i, i);
            String evenString = this.palindromeLength(s, i, i+1);
            if(maxLen < oddString.length()){
                maxLen = oddString.length();
                ans = oddString;
            }
            if(maxLen < evenString.length()){
                maxLen = evenString.length();
                ans = evenString;
            }
        }
        return ans;
    }

    public String palindromeLength(String s, int leftMiddle, int rightMiddle){
        if(rightMiddle >= s.length()){
            return s.substring(leftMiddle, leftMiddle + 1);
        }
        while(leftMiddle >= 0 && rightMiddle < s.length() &&
                s.charAt(leftMiddle) == s.charAt(rightMiddle)){
            leftMiddle--;
            rightMiddle++;
        }
        return s.substring(leftMiddle + 1, rightMiddle);
    }

    public static void main(String args[]){
        String test = "ac";
        Longest_palindromic_substring s = new Longest_palindromic_substring();
        System.out.println(s.longestPalindrome(test));
    }
}
