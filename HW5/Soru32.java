public class HelloWorld{

     public static void main(String[] args) { 
         List<String> bottles = Arrays.asList("glass", "plastic"); 
         for (int type = 0; type < bottles.size();) // Bir {} kullan�lmad�g�ndan d�ng� g�vdesinden ba��ms�zd�r. Break ifadesi d�ng�de de�il. Kod derlenmez.
         System.out.print(bottles.get(type) + ","); 
         break;
         System.out.print("end");
         
     }
}