public class backtreaking_N_queens {
    // printing chess board
    public static void printChessBoard(char arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();

        }
        System.out.println("------newboard-------");
    }

    // checking if the place is safe to place queen or not
    public static boolean issafe(char arr[][], int row, int col) {
        // up
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }

        // left digonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    // real problem
    public static void nQueens(char arr[][], int row) {
        if (row == arr.length) {
            printChessBoard(arr);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (issafe(arr, row, i)) {
                arr[row][i] = 'Q';
                nQueens(arr, row + 1);
                arr[row][i] = '*';
            }

        }
    }

    // this is for bishops
    // Bnsafe
    public static boolean BisSafe(char board[][], int row, int col) {
        // left digonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'B') {
                return false;
            }
        }

        // righ diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'B') {
                return false;
            }
        }

        return true;
    }

    // NBISHOP
    public static void nBishops(char board[][], int row) {
        if (row == board.length) {
            printChessBoard(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (BisSafe(board, row, i)) {
                board[row][i] = 'B';
                nBishops(board, row + 1);
                board[row][i] = '*';
            }

        }
    }

    public static void main(String[] args) {
        int n = 4;
        char arr[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '*';
            }
        }
        // printChessBoard(arr);
        // nQueens(arr, 0);

        nBishops(arr, 0);
    }
}
