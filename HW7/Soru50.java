package ai;
import java.io.*;
class Machine { 
    public boolean turnOn() throws EOFException {return true;}
    
}public class Robot extends Machine { 
    public boolean turnOn() throws IOException {return false;}
    public static void main(String[] doesNotCompute) throws Exception { 
        Machine m = new Robot(); 
        System.out.print(m.turnOn()); 
        //�stisnalar d���nda bir y�ntemi ge�ersiz k�lma kural�, alt s�n�f�n yeni veya daha geni� kontrol edilen istisnalar� atamamas�d�r. IOException EOFException'�n bir �st s�n�f�d�r, soru a��klamas�ndan bunun daha geni� bir istisna oldu�unu ve bu nedenle uyumlu olmad���n� g�r�yoruz. Bu nedenle, kod derlenmez ve C do�ru cevapt�r.
    }
    
}