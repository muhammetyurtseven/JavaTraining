public class HelloWorld{

     public static void main(String []args){
      boolean balloonInflated = false;
      do { if (!balloonInflated) { 
          balloonInflated = true; System.out.print("inflate-"); //Ýlk önce true olacaðýndan burasý çalýþýr ve ekrana inflate- yazar
          
      }} while (! balloonInflated);System.out.println("done"); //sonra burasý çalýþarak inflate-done olacaktýr
     }
}