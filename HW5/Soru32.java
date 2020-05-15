public class HelloWorld{

     public static void main(String[] args) { 
         List<String> bottles = Arrays.asList("glass", "plastic"); 
         for (int type = 0; type < bottles.size();) // Bir {} kullanýlmadýgýndan döngü gövdesinden baðýmsýzdýr. Break ifadesi döngüde deðil. Kod derlenmez.
         System.out.print(bottles.get(type) + ","); 
         break;
         System.out.print("end");
         
     }
}