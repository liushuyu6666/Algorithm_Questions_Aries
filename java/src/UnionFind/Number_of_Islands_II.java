package UnionFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number_of_Islands_II {
    class UnionFind{
        int[] rank;
        int[] parent;

        public void init(int nums){
            rank = new int[nums];
            parent = new int[nums];
            Arrays.fill(rank, 0);
            for(int i = 0; i < nums; i++){
                parent[i] = i;
            }
        }

        public int find(int x){
            if(parent[x] == x) return x;
            parent[x] = find(parent[x]);
            return parent[x];
        }

        public void merge(int x, int y){
            int rootX = find(x), rootY = find(y), rankX = rank[rootX], rankY = rank[rootY];
            if(x == y) return;
            if(rankX <= rankY) parent[rootX] = rootY;
            else parent[rootY] = rootX;
            if(rankX == rankY) rank[rootY]++;
        }
    }

    public boolean isArea(int m, int n, int[] pos){
        int x = pos[0], y = pos[1];
        if(x>=0&&x<m&&y>=0&&y<n) return true;
        return false;
    }

    public int eigenValue(int m, int n, int[] pos){
        int x = pos[0], y = pos[1];
        return x*n+y;
    }

    public int[] move(int[] pos, int[] dir){
        return new int[]{pos[0] + dir[0], pos[1] + dir[1]};
    }

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        UnionFind uf = new UnionFind();
        uf.init(m * n);
        List<Integer> ans = new ArrayList<>();
        int countPos = 0, countUnion = 0, aroundEigen = 0, eigenValue = 0;
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int[] map = new int[m*n];
        int[] around;
        Arrays.fill(map, 0);

        for(int[] p : positions){
            eigenValue = eigenValue(m, n, p);
            if(isArea(m, n, p) && map[eigenValue] != 1){
                countPos++;
                map[eigenValue] = 1;
                for(int[] d : directions){
                    around = move(p, d);
                    aroundEigen = eigenValue(m, n, around);
                    if(isArea(m, n, around) && map[aroundEigen] == 1 && uf.find(eigenValue) != uf.find(aroundEigen)){
                        uf.merge(eigenValue, aroundEigen);
                        countUnion++;
                    }
                }
            }
            ans.add(countPos - countUnion);
        }
        return ans;
    }

    public static void main(String args[]){
        int[][] atlas = {{0,1},{1,2},{2,1},{1,0},{0,2},{0,0},{1,1}};
        Number_of_Islands_II s = new Number_of_Islands_II();
        System.out.println(s.numIslands2(3, 3, atlas));
    }
}
