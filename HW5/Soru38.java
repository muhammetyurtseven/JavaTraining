package chicago;
public class Loop { 
    private static int count; 
    private static String[] stops = new String[] { "Washington", "Monroe", "Jackson", "LaSalle" }; 
    public static void main(String[] args) { 
        while (count < stops.length) { 
            if (stops[count++].length() < 8) { continue; } 
            
        } System.out.println(count); //her art�r�m�nda say�ld�g�nda en son count 4 olarak c�kacakt�r.
        
    }
    
}