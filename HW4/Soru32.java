package unix;
import java.util.*;
public class EchoFirst { 
    public static void main(String[] args) { 
        String one = args[0]; 
        Arrays.sort(args); //burada seed ve flower de�i�kenleri s�raland�g�nda flower seed olacakt�r.
        int result = Arrays.binarySearch(args, one); 
        System.out.println(result); //sonu� olarak seed 1 olacag�ndan 1 d�nd�recektir.
        
    }
    
} 