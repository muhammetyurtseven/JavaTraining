package fun;
public class Sudoku {
    static int[][] game;
    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        game[3][3] = "X"; // int ama�l� bir dizide string bir ifade olamayaca��ndan hata verir.
        System.out.println(game[3][3]);
        }
        
    
}