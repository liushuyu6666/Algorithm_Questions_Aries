import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Number_of_islands_II {
    public class UnionFind{
        int unionCount = 0;
        int[] parent;
        int[] rank;

        public int find(int x){
            if(this.parent[x] == x){
                return x;
            }
            this.parent[x] = find(this.parent[x]);
            return this.parent[x];
        }

        public void union(int x, int y){
            this.unionCount++;
            int rootX = this.find(x);
            int rootY = this.find(y);

            if(this.rank[rootX] > this.rank[rootY]){
                this.parent[rootY] = rootX;
            }
            else{
                this.parent[rootX] = rootY;
            }
            if(this.rank[rootX] == this.rank[rootY]){
                this.rank[rootY]++;
            }
        }

        public void initializer(int cnt){
            this.parent = new int[cnt];
            this.rank = new int[cnt];
            for(int i = 0; i < cnt; i++){
                this.parent[i] = -1;
                this.rank[i] = 0;
            }
        }

        public int getUnionCount(){
            return this.unionCount;
        }
    }

    public boolean isArea(int m, int n, int x, int y){
        if(x >= 0 && x < m && y >= 0 && y < n){
            return true;
        }
        return false;
    }

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        UnionFind uf = new UnionFind();
        uf.initializer(m * n);
        int eigenValue, leftEigenValue, rightEigenValue, topEigenValue, bottomEigenValue, gridCount=0;
        int[] newPos;
        List<Integer> ans = new ArrayList<>();
        for(int[] p : positions){
            eigenValue = p[0] * n + p[1];
            if(uf.parent[eigenValue] == -1){
                gridCount++;
                uf.parent[eigenValue] = eigenValue;
                uf.rank[eigenValue] = 1;
                if(isArea(m, n, p[0], p[1] - 1)){
                    leftEigenValue = p[0] * n + p[1] - 1;
                    if(uf.parent[leftEigenValue] != -1 && uf.find(leftEigenValue) != uf.find(eigenValue))
                        uf.union(eigenValue, leftEigenValue);
                }
                if(isArea(m, n, p[0], p[1] + 1)){
                    rightEigenValue = p[0] * n + p[1] + 1;
                    if(uf.parent[rightEigenValue] != -1 && uf.find(rightEigenValue) != uf.find(eigenValue))
                        uf.union(eigenValue, rightEigenValue);
                }
                if(isArea(m, n, p[0] - 1, p[1])){
                    topEigenValue = (p[0] - 1) * n + p[1];
                    if(uf.parent[topEigenValue] != -1 && uf.find(topEigenValue) != uf.find(eigenValue))
                        uf.union(eigenValue, topEigenValue);
                }
                if(isArea(m, n, p[0] + 1, p[1])){
                    bottomEigenValue = (p[0] + 1) * n + p[1];
                    if(uf.parent[bottomEigenValue] != -1 && uf.find(bottomEigenValue) != uf.find(eigenValue))
                        uf.union(eigenValue, bottomEigenValue);
                }
            }
            ans.add(gridCount - uf.unionCount);
        }
        return ans;
    }

    public static void main(String args[]){
        Number_of_islands_II s = new Number_of_islands_II();
        int[][] land = {{0,0},{0,1},{1,2},{2,1},{1,0},{0,0},{2,2},{1,2},{1,1},{0,1}};
        List<Integer> ans = s.numIslands2(3, 3, land);
        System.out.println(ans);
    }
}
