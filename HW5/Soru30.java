public class HelloWorld{

     public static void main(String []args){
      int count = 10;
      List<Character> chars = new ArrayList<>();
      do { chars.add('a'); 
      for (Character x : chars) count -=1;}  // burada ilkinde 1 ile 9 olur sonra 2-7 olur sonra 3 -4 olur ve 4-0 þeklinde olacaðýndan 4 kere çalýþacaktýr.
      while (count > 0);System.out.println(chars.size());
     }
}