package bob;
public class AreYouBob { 
    public static void main(String[] unused) { 
        String bob = new String("bob");
        String notBob = bob;
        System.out.print((bob==notBob)+" "+(bob.equals(notBob))); //bob ve notbob'un ikisininde de�eri ayn� oldugunda true true verecektir.
        
    }
    
}