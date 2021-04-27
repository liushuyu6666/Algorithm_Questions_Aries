package Rotate;

public class Rotate_image {
    public void rotate(int[][] matrix){
        int n = matrix.length;  // n = 4;
        int layer = n / 2; // layer = 2;
        int temp, x, y;

        for(int l = 0; l < layer; l++){
            for(int i = l; i <= n - 2 - l; i++){
                x = i;
                y = l;
                temp = matrix[x][y]; // (1, 0)
                matrix[x][y] = matrix[n-y-1][x]; // (3, 1)
                matrix[n-y-1][x] = matrix[n-x-1][n-y-1]; // (2, 3)
                matrix[n-x-1][n-y-1] = matrix[y][n-x-1]; // (0, 2)
                matrix[y][n-x-1] = temp;
            }
        }
        return;
    }

    public static void main(String args[]){
        Rotate_image s = new Rotate_image();
        int[][] matrix = {{5, 1, 9, 11}, {2, 4 ,8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        s.rotate(matrix);
        for(int[] row: matrix){
            for(int col: row){
                System.out.println(col);
            }
        }
    }
}
