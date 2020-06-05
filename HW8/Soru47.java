package lighting;
interface Source { 
    void flipSwitch() throws Exception;}
    public class LightBulb implements Source {


 
 public void flipSwitch() { 
     try { System.out.print("Circuit Break!"); //try bloðu yanlýþ anahtar kelimeyi kullanýyor,, bir exception oluþturur. Bu nedenle kod derlenmez ve Seçenek D doðrudur. Ama bu þekilde deðiþtirilirse kod derlenir ve Circuit Break!Flipped! olur.
         
     } 
     finally { System.out.print("Flipped!"); 
         
     } 
     
 } 
 public static void main(String... electricity) throws Throwable { 
         final Source bulb = new LightBulb();
         bulb.flipSwitch(); 
     
 }
        
    }