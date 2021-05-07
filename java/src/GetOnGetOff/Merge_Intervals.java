package GetOnGetOff;

import java.util.Arrays;
import java.util.LinkedList;

public class Merge_Intervals {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> ans = new LinkedList<>();
        for(int[] i : intervals){
            if(ans.size() == 0){
                ans.add(i);
            }
            else if(i[0] > ans.getLast()[1]){
                ans.add(i);
            }
            else if(i[1] > ans.getLast()[1]){
                ans.getLast()[1] = i[1];
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}
