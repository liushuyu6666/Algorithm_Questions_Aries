package ZZTrashBin;

public class Climbing_stairs {
    public int climbStairs(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;


        int[] ways = new int[n];

        ways[0] = 1;
        ways[1] = 2;

        int i = 2;
        while(i < n){
            ways[i] = ways[i-1] + ways[i-2];
            i++;
        }
        return ways[i - 1];
    }
}
