public class Deneme { 
    public static void main(String[] args) { 
       StringBuilder builder = new StringBuilder();
       String str = new String("Leaves growing");
       do { 
           System.out.println(str);

        } while (builder); //Bir do-while d�ng�s�, bir boolean ko�ulu gerektirir. Kod derlenmez ve Se�enek C do�rudur.
        System.out.println(builder);
        
    }
    
}