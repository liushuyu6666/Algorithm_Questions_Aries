package ZZTrashBin;

public class Valid_palindrome {
    public boolean isPalindrome(String s){
        if(s.length() < 1) return true;

        int len = s.length();
        if(len < 1) return true;
        int i = 0, j = len - 1;

        while(i <= j){
            // !! check if i or j beyond the bounds
            while(i < s.length() && !Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))){
                i++;
            }
            while(j >= 0 && !Character.isDigit(s.charAt(j)) && !Character.isLetter(s.charAt(j))){
                j--;
            }
            // !! check if i or j beyond the bounds
            if(i == s.length() || j == -1) return true;
            else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]){
        String str = " ";
        Valid_palindrome s = new Valid_palindrome();
        System.out.println(s.isPalindrome(str));
    }
}
