package recreation;
public class Dancing {
    public static void main(String[] vars) { 
        int leaders = 10 * (2 + (1 + (2 / 5))); // Burada parantez eksikliði oluþtugundan dolayý kod derlenmez ama parantezler eklendiði zaman Too many ekrana çýktý olarak vermektedir.
        int followers = leaders * 2; 
        System.out.print(leaders + followers < 10 ? "Too few" : "Too many"); 
        
    }
    
}