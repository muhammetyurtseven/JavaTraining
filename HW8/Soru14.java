package office;
import java.io.*;
public class Printer { 
    public void print() { 
        try { 
            throw new FileNotFoundException(); 
            
        } 
        catch (IOException exception) { 
            System.out.print("Z"); 
            
        } 
        catch (FileNotFoundException enfe) { 
            System.out.print("X"); 
            //catch bloklar� yanl�� s�rada kullan�ld���ndan kod derlenmez. IOException, FileNotFoundException ��esinin bir �st s�n�f� oldu�undan, FileNotFoundException eri�ilemeyen kod olarak kabul edilir. Bu nedenle, kod derlenmez ve Se�enek C do�rudur.
        } 
            finally { 
                System.out.print("Y"); 
            
        } 
        
    }

 
 public static void main(String... ink) { new Printer().print(); }}