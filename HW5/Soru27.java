public class HelloWorld{

     public static void main(String []args){
      boolean balloonInflated = false;
      do { if (!balloonInflated) { 
          balloonInflated = true; System.out.print("inflate-"); //�lk �nce true olaca��ndan buras� �al���r ve ekrana inflate- yazar
          
      }} while (! balloonInflated);System.out.println("done"); //sonra buras� �al��arak inflate-done olacakt�r
     }
}