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
            //catch bloklarý yanlýþ sýrada kullanýldýðýndan kod derlenmez. IOException, FileNotFoundException öðesinin bir üst sýnýfý olduðundan, FileNotFoundException eriþilemeyen kod olarak kabul edilir. Bu nedenle, kod derlenmez ve Seçenek C doðrudur.
        } 
            finally { 
                System.out.print("Y"); 
            
        } 
        
    }

 
 public static void main(String... ink) { new Printer().print(); }}