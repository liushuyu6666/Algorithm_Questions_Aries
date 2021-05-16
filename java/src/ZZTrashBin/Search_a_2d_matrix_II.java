package ZZTrashBin;

public class Search_a_2d_matrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length < 1 || matrix[0].length < 1) return false;
        // start from the left bottom
        int x = matrix.length - 1, y = 0;
        while(x>=0 && y<matrix[0].length){
            if(matrix[x][y] == target) return true;
            else{
                if(matrix[x][y] > target){
                    x--;
                }
                else{
                    y++;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 5;
        Search_a_2d_matrix_II s = new Search_a_2d_matrix_II();
        System.out.println(s.searchMatrix(matrix, target));
    }
}
