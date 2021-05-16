package ZZTrashBin;

public class Reverse_string {
    public void reverseString(char[] s){
        int len = s.length;
        char temp;

        for(int i = 0; i < len / 2; i++){
            temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }
        return;
    }

    public static void main(String args[]){
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        Reverse_string s = new Reverse_string();
        s.reverseString(str);
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}
