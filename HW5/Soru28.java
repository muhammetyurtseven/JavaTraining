public class HelloWorld{

     public static void main(String []args){
      String letters = "";
      while (letters.length() != 3) letters+="ab";
      System.out.println(letters); // d�ng� s�rekli devam edece�inden d�ng� bitmeyecektir. Sonsuz d�ng�ye girecektir.
     }
}