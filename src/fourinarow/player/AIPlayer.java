package fourinarow.player;

import fourinarow.Board;
import fourinarow.Piece;

import java.util.Random;

public class AIPlayer implements Player {

    Piece.Color color;
    public AIPlayer(Piece.Color color){
        this.color = color;
    }

    @Override
    public void play(Board board) {
        Random random = new Random();
        int column = random.nextInt(8);
        int outputColumn = column;
        switch (column) {
            case 0:
                column = 1;
                break;
            case 1:
                column = 3;
                break;
            case 2:
                column = 5;
                break;
            case 3:
                column = 7;
                break;
            case 4:
                column = 9;
                break;
            case 5:
                column = 11;
                break;
            case 6:
                column = 13;
                break;
            case 7:
                column = 15;
                break;
        }

        board.addPiece(color,column);

        board.printOutCurrentBoard();
        System.out.println("AI played column: " + outputColumn);
    }
}
