package ZZTrashBin;

public class Number_of_islands {
    public int numIslands(char[][] grid){
        int islandsNum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    islandsNum++;
                    infect(i, j, grid);
                }
            }
        }
        return islandsNum;
    }
    public void infect(int x, int y, char[][] grid){
        if(x < grid.length && x >= 0 && y < grid[0].length
        && y >= 0 && grid[x][y] == '1'){
            grid[x][y] = '2';
            infect(x-1,y,grid);
            infect(x+1,y,grid);
            infect(x,y-1,grid);
            infect(x,y+1,grid);
        }
    }
}
