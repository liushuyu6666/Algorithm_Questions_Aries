package ZZTrashBin;

import java.util.HashSet;
import java.util.Set;

public class Valid_sudoku {
    public boolean isValidSudoku(char[][] board){
        Set<Character> [] rows = new HashSet[9];
        Set<Character> [] cols = new HashSet[9];
        Set<Character> [] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<Character>(9);
            cols[i] = new HashSet<Character>(9);
            boxes[i] = new HashSet<Character>(9);
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(rows[i].contains(board[i][j])) return false;
                    else rows[i].add(board[i][j]);

                    if(cols[j].contains(board[i][j])) return false;
                    else cols[j].add(board[i][j]);

                    if(boxes[i/3 * 3 + j/3].contains(board[i][j])) return false;
                    else boxes[i/3 * 3 + j/3].add(board[i][j]);
                }
            }
        }
        return true;
    }

    public static void main(String args[]){
        char[][] board = { {'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        Valid_sudoku s = new Valid_sudoku();
        System.out.println(s.isValidSudoku(board));
    }
}
