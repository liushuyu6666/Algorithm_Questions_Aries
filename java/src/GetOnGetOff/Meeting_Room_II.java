package GetOnGetOff;

import java.util.Arrays;

public class Meeting_Room_II {
    public int minMeetingRooms(int[][] intervals) {
        int[] begin = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            begin[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(begin);
        Arrays.sort(end);
        int j = 0, cnt = 0, ans = 0;
        for(int i = 0; i < intervals.length; i++){
            if(begin[i] < end[j]){
                cnt++;
                ans = Math.max(ans, cnt);
            }
            else{
                j++;
            }
        }
        return ans;
    }

    public int minMeetingRooms_method2(int[][] intervals){
        int[][] box = new int[intervals.length * 2][2];
        for(int i = 0; i < intervals.length; i++){
            box[i] = new int[]{intervals[i][0], 1};
            box[i + intervals.length] = new int[]{intervals[i][1], -1};
        }
        Arrays.sort(box, (a, b) -> {
            if(Integer.compare(a[0], b[0]) != 0){
                return Integer.compare(a[0], b[0]);
            }
            else{
                return Integer.compare(a[1], b[1]);
            }
        });
        int cnt = 0, ans = 0;
        for(int i = 0; i < box.length; i++){
            cnt += box[i][1];
            ans = Math.max(cnt, ans);
        }
        return ans;
    }
}
