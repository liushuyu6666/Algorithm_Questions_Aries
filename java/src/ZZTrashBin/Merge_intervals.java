package ZZTrashBin;

import java.util.Arrays;
import java.util.LinkedList;

public class Merge_intervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> ans = new LinkedList<>();
        for(int[] i : intervals){
            if(ans.size() < 1 || ans.getLast()[1] < i[0]){
                ans.add(i);
            }
            else{
                ans.getLast()[1] = Math.max(i[1], ans.getLast()[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String args[]) {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Merge_intervals s = new Merge_intervals();
        s.merge(intervals);
    }
}
