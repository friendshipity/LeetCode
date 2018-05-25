/**
 * Created by Administrator on 2017/11/15.
 */
public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j =0;j <board[0].length;j++){
             //   board[i][j] ;
            }
        }        return  true;
    }

    public static void main(String[] args){
        String[][] input  = {{"1",".","7","6","5","4","3","2","1"},{"2",".",".",".",".",".",".",".","."},{"3",".",".",".",".",".",".",".","."},{"4",".",".",".",".",".",".",".","."},{"5",".",".",".",".",".",".",".","."},{"6",".",".",".",".",".",".",".","."},{"7",".",".",".",".",".",".",".","."},{"8",".",".",".",".",".",".",".","."},{"9",".",".",".",".",".",".",".","."}};
        char[][] inputC = new char[input.length][input[0].length];
        for(int i=0;i<input.length;i++){
            for(int j =0;j <input[0].length;j++){
                inputC[i][j] = input[i][j].charAt(0);
            }
        }

        System.out.println("123");


    }
}
