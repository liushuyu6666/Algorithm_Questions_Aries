package ZZTrashBin;

public class Word_Search_Best_Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(valid(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    public boolean valid(char[][] board, int x, int y, String word, int wordIdx){
        if(wordIdx == word.length()) return true;
        if(x<0||y<0||x>=board.length||y>=board[0].length) return false;
        if(board[x][y] != word.charAt(wordIdx)) return false;
        board[x][y] ^= 128;
        boolean next = valid(board, x-1, y, word, wordIdx+1) // left
                || valid(board, x+1, y, word, wordIdx+1) // right
                || valid(board, x, y-1, word, wordIdx+1) // top
                || valid(board, x, y+1, word, wordIdx+1); // bottom
        board[x][y] ^= 128;
        return next;
    }

    public static void main(String args[]){
        char[][] board = new char[][]
                {{'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'}};

        Word_Search_Best_Solution word_searchBestSolution = new Word_Search_Best_Solution();
        System.out.println(word_searchBestSolution.exist(board, "AAAAAAAAAAAAAAB"));
    }
}
