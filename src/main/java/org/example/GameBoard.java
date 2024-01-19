package org.example;

public class GameBoard {
    private String[][] board = new String[][]{{Color.ANSI_GREEN + "1" + Color.ANSI_RESET,
                                               Color.ANSI_GREEN + "2" + Color.ANSI_RESET,
                                               Color.ANSI_GREEN + "3" + Color.ANSI_RESET},
                                              {Color.ANSI_GREEN + "4" + Color.ANSI_RESET,
                                               Color.ANSI_GREEN + "5" + Color.ANSI_RESET,
                                               Color.ANSI_GREEN + "6" + Color.ANSI_RESET},
                                              {Color.ANSI_GREEN + "7" + Color.ANSI_RESET,
                                               Color.ANSI_GREEN + "8" + Color.ANSI_RESET,
                                               Color.ANSI_GREEN + "9" + Color.ANSI_RESET}};

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
    public String getElBoard(int a, int b){
        return board[a][b];
    }

    public void printBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
