package fourinarow.player;

import fourinarow.Board;
import fourinarow.Piece;

import java.util.Scanner;

public class HumanPlayer implements Player{

    Piece.Color color;
    String name;

    public HumanPlayer(Piece.Color color, String name){
        this.color = color;
        this.name = name;
    }

    @Override
    public void play(Board board) {

        Scanner sc = new Scanner(System.in);

        boolean outofrange = true;
        boolean columnHasSpace = true;
        int inputColumn = 0;
        int outputColumn = 0;

        while(columnHasSpace) {

            while (outofrange) {

                System.out.print("What column?\n");
                inputColumn = sc.nextInt();
                 outputColumn = inputColumn;

                if (inputColumn < 0 || inputColumn > 7) {
                    System.out.println("Number out of range");
                } else outofrange = false;

            }
            switch (inputColumn) {
                case 0:
                    inputColumn = 1;
                    break;
                case 1:
                    inputColumn = 3;
                    break;
                case 2:
                    inputColumn = 5;
                    break;
                case 3:
                    inputColumn = 7;
                    break;
                case 4:
                    inputColumn = 9;
                    break;
                case 5:
                    inputColumn = 11;
                    break;
                case 6:
                    inputColumn = 13;
                    break;
                case 7:
                    inputColumn = 15;
                    break;
            }

            if (board.checkColumn(inputColumn)) {

                board.addPiece(color, inputColumn);
                board.printOutCurrentBoard();

                System.out.println(name + " played column: " + outputColumn );
                columnHasSpace =false;

            }

            else System.out.println("Column is full!");
            outofrange = true;

        }
    }
}
