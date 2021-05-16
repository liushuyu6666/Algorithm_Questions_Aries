package ZZTrashBin;

public class Count_and_say {
    public String countAndSay(int n){
        if(n == 1) return "1";
        String str = "1";
        for(int i = 2; i < n + 1; i++){
            str = countString(str);
        }
        return str;
    }
    private String countString(String str){
        char ch = str.charAt(0);
        int count = 1;
        StringBuilder container = new StringBuilder();

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
            else{
                container.append(count).append(ch);
                ch = str.charAt(i);
                count = 1;
            }
        }
        container.append(count).append(ch);

        return container.toString();
    }

    public static void main(String args[]){
        Count_and_say s = new Count_and_say();
        System.out.println(s.countAndSay(4));
    }
}
