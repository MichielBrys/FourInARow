package fourinarow;

public class Piece {
    public enum Color {
        RED('x'),GREEN('o');
        private char xOro;


        Color(char xOro){
            this.xOro = xOro;
        }

         char getxOro() {
            return xOro;
        }
    }
    Color color;

    public Piece(Color color){
       this.color  = color;
    }
    public Color getColor(){
        return color;
    }
    public char toChar(){
        return color.xOro;
    }
}
