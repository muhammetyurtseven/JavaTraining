package castles;
public class Fortress { 
    public void openDrawbridge() throws Exception { // p1 
    try { throw new Exception("Circle"); } 
    catch (Exception e) { System.out.print("Opening!"); } finally { 
        System.out.print("Walls"); // p2 
        } } 
        public static void main(String[] moat) { 
            new Fortress().openDrawbridge(); // p3 openDrawbridge () y�nteminin p3 sat�r�ndaki main () y�nteminden �a�r�ld���n� g�sterir. OpenDrawbridge () y�ntemi, ancak �a�r�ld��� main () y�ntemi exception i�lemez veya bildirmez. Bu kodun derlenmesi i�in, main () y�nteminin p3 sat�r� �evresinde bir try-catch olmas� gerekir.
            }
    
}