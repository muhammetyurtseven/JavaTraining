package recreation;
public class Dancing {
    public static void main(String[] vars) { 
        int leaders = 10 * (2 + (1 + (2 / 5))); // Burada parantez eksikli�i olu�tugundan dolay� kod derlenmez ama parantezler eklendi�i zaman Too many ekrana ��kt� olarak vermektedir.
        int followers = leaders * 2; 
        System.out.print(leaders + followers < 10 ? "Too few" : "Too many"); 
        
    }
    
}