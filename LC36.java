import java.util.HashSet;

// 36. Valid Sudoku
public class LC36 {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char currentVal = board[i][j];
                if( currentVal != '.'){
                    if(!seen.add(currentVal +" found in row "+i)||
                            !seen.add(currentVal +" found in col "+j)||
                            !seen.add(currentVal +" found in box "+i/3+" - "+ j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                         ,{'6','.','1','9','5','.','.','.','.'}
                         ,{'.','9','8','.','.','.','.','6','.'}
                         ,{'8','.','.','.','6','.','.','.','3'}
                         ,{'4','.','.','8','.','3','.','.','1'}
                         ,{'7','.','.','.','2','.','.','.','6'}
                         ,{'.','6','.','.','.','.','2','8','.'}
                         ,{'.','.','.','4','1','9','.','.','5'}
                         ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
}
