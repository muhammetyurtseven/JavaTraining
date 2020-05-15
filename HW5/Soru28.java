public class HelloWorld{

     public static void main(String []args){
      String letters = "";
      while (letters.length() != 3) letters+="ab";
      System.out.println(letters); // döngü sürekli devam edeceðinden döngü bitmeyecektir. Sonsuz döngüye girecektir.
     }
}