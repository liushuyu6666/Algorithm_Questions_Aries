package ZZTrashBin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generate_parenthese {
    public List<String> generateParenthesis(int n) {
        Set<String> ans = new HashSet<>();
        List<String> lans = new ArrayList<>();
        while(n != 0){
            ans = union(ans);
            n--;
        }
        for(String s: ans){
            lans.add(s);
        }
        return lans;
    }
    public Set<String> union(Set<String> box){
        Set<String> ans = new HashSet<>();
        if(box.size() == 0){
            ans.add("()");
        }
        else{
            for(String s:box){
                ans.add("()" + s);
                for(int i = 1; i < s.length(); i++){
                    String strFormer = s.substring(0, i);
                    String strLatter = s.substring(i, s.length());
                    String newcomb = strFormer + "()" + strLatter;
                    ans.add(newcomb);
                }
                ans.add(s + "()");
            }
        }
        return ans;
    }
}
