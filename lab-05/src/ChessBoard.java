import java.util.Scanner;
public class ChessBoard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] board = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                board[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (checkBingo(board, i, j)){
                    count++;
                }
            }
        }
        System.out.println("There are " + count + "bingo grids.");
    }
    public static boolean checkBingo(int[][] board, int i, int j){
        if (board[i][j] == 0 && i != 0 && j != 0 && i != board.length - 1 && j != board[0].length - 1){
            if (board[i-1][j] == 1 && board[i+1][j] == 1 && board[i][j-1] == 1 && board[i][j+1] == 1){
                return true;
            }
        }
        return false;
    }
}
