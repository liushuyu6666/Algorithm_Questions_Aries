package GreedyAlgorithm;

import java.util.Arrays;

public class Task_Scheduler {
    public int leastInterval(char[] tasks, int n) {
        if(n == 0) return tasks.length;
        int[] countTasks = new int[26];
        Arrays.fill(countTasks, 0);
        for(int i = 0; i < tasks.length; i++){
            countTasks[tasks[i] - 'A']++;
        }
        Arrays.sort(countTasks);
        int maxCount = 0;
        int count = countTasks[25];
        for(int i = 24; i >= 0; i--){
            if(countTasks[i] == count){
                maxCount++;
            }
            else{
                break;
            }
        }
        // System.out.println(count);
        // System.out.println(maxCount);
        int ans = (count - 1) * (n + 1) + 1 + maxCount;
        return Math.max(ans, tasks.length);
    }
}
