package ZZTrashBin;

public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix){

        boolean zeroRow = false, zeroCol = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) zeroRow = true;
                    if(j == 0) zeroCol = true;
                    if(i != 0 && j != 0){
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for(int i = matrix.length - 1; i > 0; i--) {
            for(int j = matrix[0].length - 1; j > 0; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(zeroRow){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

        if(zeroCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String args[]){
        Set_Matrix_Zeroes s = new Set_Matrix_Zeroes();
        int[][] matrix = new int[][]{
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5},
        };
        s.setZeroes(matrix);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
