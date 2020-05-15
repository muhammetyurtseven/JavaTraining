public class Deneme { 
    public static void main(String[] args) { 
       StringBuilder builder = new StringBuilder();
       String str = new String("Leaves growing");
       do { 
           System.out.println(str);

        } while (builder); //Bir do-while döngüsü, bir boolean koþulu gerektirir. Kod derlenmez ve Seçenek C doðrudur.
        System.out.println(builder);
        
    }
    
}