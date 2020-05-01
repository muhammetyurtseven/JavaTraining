package restaurant;public class Pieces { 
    public static void main(String[] info) { 
        int flair = 15;

 
 if(flair >= 15 && flair < 37) {
     System.out.print("Not enough"); //şartı sağladığı için ilk bunu basar.
     
 } 
 if(flair==37) { 
     System.out.print("Just right"); //şart sağlanmaz ve elseye geçer
     
 } 
 else  { System.out.print("Too many");  } //ikinci olarak bunu ekrana bunu basar ve sonuç Not enoughToo many olarak çıktı alınır.
        
    }
    
}