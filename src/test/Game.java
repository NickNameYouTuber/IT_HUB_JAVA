package test;

class Game {
    private char[][] board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public boolean isGameOver() {
        return false;
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new char[3][3];
        this.currentPlayer = player1;
    }

    public boolean makeMove(int x, int y) {
        if (board[x][y] == '\0') {
            board[x][y] = currentPlayer.getSymbol();
            switchPlayer();
        } else {
            System.out.println("Invalid move.");
        }
        return false;
    }

    public void printBoard() {
        // Print the board in the console with symbols
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}