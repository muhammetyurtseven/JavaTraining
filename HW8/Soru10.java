package castles;
public class Fortress { 
    public void openDrawbridge() throws Exception { // p1 
    try { throw new Exception("Circle"); } 
    catch (Exception e) { System.out.print("Opening!"); } finally { 
        System.out.print("Walls"); // p2 
        } } 
        public static void main(String[] moat) { 
            new Fortress().openDrawbridge(); // p3 openDrawbridge () yönteminin p3 satýrýndaki main () yönteminden çaðrýldýðýný gösterir. OpenDrawbridge () yöntemi, ancak çaðrýldýðý main () yöntemi exception iþlemez veya bildirmez. Bu kodun derlenmesi için, main () yönteminin p3 satýrý çevresinde bir try-catch olmasý gerekir.
            }
    
}