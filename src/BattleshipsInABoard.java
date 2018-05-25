/**
 * Created by Administrator on 2017/2/13.
 */
public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int num = 0;
        char register;
        //  if(board!=null)
        //init
        int[][] intboard = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.')
                    intboard[i][j] = 1;
                else
                    intboard[i][j] = 0;
            }
        //start

        //vertical increase
        for (int i = 0; i < intboard.length; i++)
            for (int j = 0; j < intboard[i].length; j++) {
                if(i!=intboard.length-1){
                    if(intboard[i][j] !=0 && intboard[i+1][j]==1){
                        intboard[i+1][j]=intboard[i][j]+1;
                    }
                }
            }
        for (int i = 0; i < intboard.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < intboard[0].length; j++)
                System.out.print(intboard[i][j]+",");
        }

        //set init


        //horizontal increase
        for (int i = 0; i < intboard.length; i++)
            for (int j = 0; j < intboard[i].length; j++) {
                if(j!=intboard[i].length-1){
                    if(intboard[i][j] !=0 && intboard[i][j+1]==1){
                        intboard[i][j+1]=intboard[i][j]+1;
                    }
                }
            }




        for (int i = 0; i < intboard.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < intboard[0].length; j++)
                System.out.print(intboard[i][j]+",");
        }
        return 1;
    }


//todo ansewer battleship
    public int countBattleships2(char[][] board) {
        int m = board.length;
        if (m==0) return 0;
        int n = board[0].length;

        int count=0;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == '.') continue;
                if (i > 0 && board[i-1][j] == 'X') continue;
                if (j > 0 && board[i][j-1] == 'X') continue;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] input = {{'x', '.', '.', 'x'}, {'.', '.', '.', 'x'}, {'.', '.', '.', 'x'}};
        System.out.println(input[0].length);
        System.out.println(input.length);
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();
        battleshipsInABoard.countBattleships(input);
    }
}
