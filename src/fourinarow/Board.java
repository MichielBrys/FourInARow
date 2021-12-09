package fourinarow;



public class Board {
    public final int WIDTH = 17;
    public final int HEIGHT = 17;
    private char[][] board = new char[WIDTH][HEIGHT];



    public Board() {

    }
 /*  public void has4InARow() {

        for (int row = 0; row < HEIGHT; row++) {
            int counter = 1;
            int columnIndex = 1;
            while (columnIndex < WIDTH) {
                if (board[columnIndex][row]== board[columnIndex][row+2] && board[columnIndex][row] != ' ') {
                    counter++;
                    if (counter == 4) System.out.println("FOUR IN A ROW YAY");
                } else {
                    counter = 1;
                }
                columnIndex++;
            }
        }


       for (int col = 0; col < WIDTH; col++) {
            Piece currentPiece = pieces[col][0];
            int counter = 1;
            int rowIndex = 1;
            while (rowIndex < HEIGHT) {
                if (currentPiece!=null&&pieces[col][rowIndex]!=null
                        &&pieces[col][rowIndex].getColor() == currentPiece.getColor()) {
                    counter++;
                    if (counter == 4) return currentPiece.getColor();
                } else {
                    currentPiece = pieces[col][rowIndex];
                    counter = 1;
                }
                rowIndex++;
            }
        }
        //DIAGONAAL
        //TODO
        return null;
    }*/




    public void makeBoard() {
        System.out.println(" 0 1 2 3 4 5 6 7");
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                if (i % 2 == 0) {
                    board[i][j] = '-';
                } else if (j % 2 == 0) {
                    board[i][j] = '|';
                } else {
                    board[i][j] = ' ';
                }
                System.out.print(board[i][j]);
            }
            System.out.println();

        }

    }


    public boolean isFull() {
        boolean isfull = false;
        int counter = 0;
        for (int i = 1; i < WIDTH; i += 2) {
            if (!(board[1][i] == ' ')) {
                counter++;
                if (counter == 8) {
                    isfull = true;
                }
            } else {
                isfull = false;
            }
        }
        return isfull;

    }


    public boolean checkColumn(int inputColumn){
        if (board[1][inputColumn] == ' ') {
            return true;
        }
         return false;
    }


    public void addPiece(Piece.Color piece, int inputColumn) {

        for (int i = 16; i >= 0; i--) {
            if (board[i][inputColumn] == ' ') {
                board[i][inputColumn] = piece.getxOro();
                return;
            }
        }
    }


    public void printOutCurrentBoard() {

        System.out.println();
        System.out.println(" 0 1 2 3 4 5 6 7");
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

}


