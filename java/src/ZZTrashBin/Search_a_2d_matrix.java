package ZZTrashBin;

public class Search_a_2d_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length < 1 || matrix[0].length < 1) return false;
        int r = matrix.length, c = matrix[0].length, leftBound = 0, rightBound = r * c - 1, middle = (leftBound + rightBound) / 2;
        while(parse1D2D(matrix, leftBound) != target && parse1D2D(matrix, rightBound) != target && parse1D2D(matrix, middle) != target){
            if(rightBound - leftBound < 2) return false;
            if(parse1D2D(matrix, middle) < target){
                leftBound = middle;
                middle = (leftBound + rightBound) / 2;
            }
            else{
                rightBound = middle;
                middle = (leftBound + rightBound) / 2;
            }
        }
        return true;
    }
    public int parse1D2D(int[][] matrix, int pos){
        int x = pos / matrix[0].length, y = pos % matrix[0].length;
        return matrix[x][y];
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
        Search_a_2d_matrix s = new Search_a_2d_matrix();
        System.out.println(s.searchMatrix(matrix, target));
    }
}
