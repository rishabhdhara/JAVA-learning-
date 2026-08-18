import java.util.Scanner;

public class TicTacToe {

    // board starts with numbers 1-9 so the player knows which key to press
    static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    static int currentPlayer = 1; // 1 = X, 2 = O
    static int turns = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            printBoard();

            char playerSymbol = (currentPlayer == 1) ? 'X' : 'O';
            System.out.println("Player " + currentPlayer + " (" + playerSymbol + "), choose a number 1-9: ");
            int choice = scanner.nextInt();

            if (!isValidMove(choice)) {
                System.out.println("Invalid move, try again.\n");
                continue;
            }

            placeMark(choice, playerSymbol);
            turns++;


            if (turns == 9) {
                printBoard();
                System.out.println("It's a tie!");
                gameRunning = false;
            } else if (checkWin(playerSymbol)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " (" + playerSymbol + ") wins!");
                gameRunning = false;
            } else {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }

    }

    static void printBoard() {
        System.out.println();
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println();
    }

    static boolean isValidMove(int choice) {
        if (choice < 1) {
            return false;
        }
        int row = (choice - 1) / 3;
        int col = (choice - 1) % 3;
        return board[row][col] != 'X' && board[row][col] != 'O';
    }

    static void placeMark(int choice, char symbol) {
        int row = (choice - 1) / 3;
        int col = (choice - 1) % 3;
        board[row][col] = symbol;
    }

    static boolean checkWin(char symbol) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;

        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;

        return false;
    }
}