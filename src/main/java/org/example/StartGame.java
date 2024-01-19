package org.example;

import java.util.Scanner;

public class StartGame {
    GameBoard gameBoard = new GameBoard();
    String currentPlayer = "X";
    public void playGame(){
        gameBoard.getBoard();
        gameBoard.printBoard();
        String [][] arr = gameBoard.getBoard();

        Scanner scanner = new Scanner(System.in);
        String entry;

        while (true){
            System.out.println("Игрок " + Color.ANSI_RED + currentPlayer + Color.ANSI_RESET + " введите цифру, куда поставить " +
                                Color.ANSI_RED + currentPlayer + Color.ANSI_RESET);
            entry = scanner.nextLine();
            int intEntry = Integer.parseInt(entry);

            if (intEntry < 1 || intEntry > 9){
                System.out.println(Color.ANSI_RED + "Невернный ввод! Попробуйте снова!" + Color.ANSI_RESET);
                continue;
            }

            switch (intEntry){
                case 1:
                    if (arr[0][0].equals("X") || arr[0][0].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[0][0] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                break;
                case 2:
                    if (arr[0][1].equals("X") || arr[0][1].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[0][1] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                break;
                case 3:
                    if (arr[0][2].equals("X") || arr[0][2].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[0][2] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                    break;
                case 4:
                    if (arr[1][0].equals("X") || arr[1][0].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[1][0] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                    break;
                case 5:
                    if (arr[1][1].equals("X") || arr[1][1].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[1][1] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                    break;
                case 6:
                    if (arr[1][2].equals("X") || arr[1][2].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[1][2] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                    break;
                case 7:
                    if (arr[2][0].equals("X") || arr[2][0].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[2][0] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                    break;
                case 8:
                    if (arr[2][1].equals("X") || arr[2][1].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[2][1] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                    break;
                case 9:
                    if (arr[2][2].equals("X") || arr[2][2].equals("O")){
                        System.out.println(Color.ANSI_RED + "Уже занято!" + Color.ANSI_RESET);
                        continue;
                    }
                    arr[2][2] = currentPlayer;
                    gameBoard.setBoard(arr);
                    gameBoard.printBoard();
                    break;
            }

            if (checkWin()) {
                System.out.println(Color.ANSI_BLUE + "Игрок " + currentPlayer + " выиграл!" + Color.ANSI_RESET);
                break;
            } else if (checkDraw(gameBoard.getBoard())){
                System.out.println(Color.ANSI_CYAN + "Ничья!" + Color.ANSI_RESET);
                break;
            }

            currentPlayer = (currentPlayer == "X") ? "O" : "X";
        }

    }
    private boolean checkWin() {
        return (gameBoard.getElBoard(0,0) == currentPlayer && gameBoard.getElBoard(0,1) == currentPlayer && gameBoard.getElBoard(0,2) == currentPlayer) ||
                (gameBoard.getElBoard(1,0) == currentPlayer && gameBoard.getElBoard(1,1) == currentPlayer && gameBoard.getElBoard(1,2) == currentPlayer) ||
                (gameBoard.getElBoard(2,0) == currentPlayer && gameBoard.getElBoard(2,1) == currentPlayer && gameBoard.getElBoard(2,2) == currentPlayer) ||
                (gameBoard.getElBoard(0,0) == currentPlayer && gameBoard.getElBoard(1,0) == currentPlayer && gameBoard.getElBoard(2,0) == currentPlayer) ||
                (gameBoard.getElBoard(0,1) == currentPlayer && gameBoard.getElBoard(1,1) == currentPlayer && gameBoard.getElBoard(2,1) == currentPlayer) ||
                (gameBoard.getElBoard(0,2) == currentPlayer && gameBoard.getElBoard(1,2) == currentPlayer && gameBoard.getElBoard(2,2) == currentPlayer) ||
                (gameBoard.getElBoard(0,0) == currentPlayer && gameBoard.getElBoard(1,1) == currentPlayer && gameBoard.getElBoard(2,2) == currentPlayer) ||
                (gameBoard.getElBoard(0,2) == currentPlayer && gameBoard.getElBoard(1,1) == currentPlayer && gameBoard.getElBoard(2,0) == currentPlayer);
    }

    private boolean checkDraw(String[][] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j].equals("X") || arr[i][j].equals("O")) count+=1;
                if (count == 9) return true;
            }
        }
        return false;
    }
}
