package transporter;
public class TurtleVsHare { 
    public static void main(String[] arguments) { 
        int turtle = 10 * (2 + (3 + 2) / 5); //buran�n sorucu 30 gelir.
        int hare = turtle < 5 ? 10 : 25; // 25
        System.out.print(turtle < hare ? "Hare wins!" : "Turtle wins!"); //30<25 olmad�g�ndan sonu� Turtle wins! gelecektir.
        
    }
    
}