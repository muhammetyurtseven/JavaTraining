package unix;
import java.util.*;
public class EchoFirst { 
    public static void main(String[] args) { 
        Arrays.sort(args); 
        String result = Arrays.binarySearch(args, args[0]); //ikili arama bir int de�er d�nd�rd���nden string bir ifade olamaz ve derlenmez.
        System.out.println(result); 
        
    }
    
}