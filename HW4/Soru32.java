package unix;
import java.util.*;
public class EchoFirst { 
    public static void main(String[] args) { 
        String one = args[0]; 
        Arrays.sort(args); //burada seed ve flower deðiþkenleri sýralandýgýnda flower seed olacaktýr.
        int result = Arrays.binarySearch(args, one); 
        System.out.println(result); //sonuç olarak seed 1 olacagýndan 1 döndürecektir.
        
    }
    
} 