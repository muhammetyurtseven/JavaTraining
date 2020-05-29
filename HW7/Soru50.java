package ai;
import java.io.*;
class Machine { 
    public boolean turnOn() throws EOFException {return true;}
    
}public class Robot extends Machine { 
    public boolean turnOn() throws IOException {return false;}
    public static void main(String[] doesNotCompute) throws Exception { 
        Machine m = new Robot(); 
        System.out.print(m.turnOn()); 
        //Ýstisnalar dýþýnda bir yöntemi geçersiz kýlma kuralý, alt sýnýfýn yeni veya daha geniþ kontrol edilen istisnalarý atamamasýdýr. IOException EOFException'ýn bir üst sýnýfýdýr, soru açýklamasýndan bunun daha geniþ bir istisna olduðunu ve bu nedenle uyumlu olmadýðýný görüyoruz. Bu nedenle, kod derlenmez ve C doðru cevaptýr.
    }
    
}