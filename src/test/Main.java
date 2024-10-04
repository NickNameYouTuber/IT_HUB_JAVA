package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(new Player("Player 1", 'X'), new Player("Player 2", 'O'));

        while (!game.isGameOver()) {
            game.printBoard();

            int x, y;
            do {
                System.out.print("Enter coordinates (x y): ");
                x = new Scanner(System.in).nextInt();
                y = new Scanner(System.in).nextInt();
                game.printBoard();
            } while (!game.makeMove(x, y));
        }

        System.out.println("Game over!");
    }
}
