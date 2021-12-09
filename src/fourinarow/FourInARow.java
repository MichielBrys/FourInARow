package fourinarow;

import fourinarow.player.AIPlayer;
import fourinarow.player.HumanPlayer;
import fourinarow.player.Player;

import java.util.Scanner;

public class FourInARow {
    Scanner sc = new Scanner(System.in);
    private Board board = new Board();


    public FourInARow() {

    }

    public void playGame() {

        boolean playerAIInputChoice = true;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder input = new StringBuilder();
        while (playerAIInputChoice) {

            System.out.println("Against player or against AI?");
            input.setLength(0);
            input.append(sc.next());



            if (input.toString().equalsIgnoreCase("player")) {
                System.out.println("Name player: ");
                sb.setLength(0);
                sb.append(sc.next());
                playerAIInputChoice = false;
            }

            else if (input.toString().equalsIgnoreCase("ai")){
                playerAIInputChoice = false;
            }
            else System.out.println("incorrect option");
        }
        System.out.println("Name player: ");
        sb2.append(sc.next());

        Player player1 = new HumanPlayer(Piece.Color.RED, sb2.toString());
        Player player2 = new AIPlayer(Piece.Color.GREEN);
        Player player3 = new HumanPlayer(Piece.Color.GREEN, sb.toString());


        if (input.toString().equalsIgnoreCase("ai")) {
            board.makeBoard();
            while (!board.isFull()) {
                player1.play(board);
                player2.play(board);

            }
            System.out.println("Board is full");
        } else if (input.toString().equalsIgnoreCase("player")) {
            board.makeBoard();
            while (!board.isFull()) {
                player1.play(board);
                player3.play(board);

            }
            System.out.println("Board is full");
        }

    }

}
