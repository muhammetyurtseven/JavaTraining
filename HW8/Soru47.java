package lighting;
interface Source { 
    void flipSwitch() throws Exception;}
    public class LightBulb implements Source {


 
 public void flipSwitch() { 
     try { System.out.print("Circuit Break!"); //try blo�u yanl�� anahtar kelimeyi kullan�yor,, bir exception olu�turur. Bu nedenle kod derlenmez ve Se�enek D do�rudur. Ama bu �ekilde de�i�tirilirse kod derlenir ve Circuit Break!Flipped! olur.
         
     } 
     finally { System.out.print("Flipped!"); 
         
     } 
     
 } 
 public static void main(String... electricity) throws Throwable { 
         final Source bulb = new LightBulb();
         bulb.flipSwitch(); 
     
 }
        
    }