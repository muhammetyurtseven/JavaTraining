package restaurant;public class Pieces { 
    public static void main(String[] info) { 
        int flair = 15;

 
 if(flair >= 15 && flair < 37) {
     System.out.print("Not enough"); //�art� sa�lad��� i�in ilk bunu basar.
     
 } 
 if(flair==37) { 
     System.out.print("Just right"); //�art sa�lanmaz ve elseye ge�er
     
 } 
 else  { System.out.print("Too many");  } //ikinci olarak bunu ekrana bunu basar ve sonu� Not enoughToo many olarak ��kt� al�n�r.
        
    }
    
}