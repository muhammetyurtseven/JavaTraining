package nyc;
public class TouristBus { 
    public static void main(String... args) { 
        String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn"}; 
        String[] times = new String[] { "Day", "Night" }; 
        for (int i=0,j=0; i < 1; i++, j++)  //Kodun çalýsmasý için int i=0, j=0; olmalýdýr.
        System.out.println(nycTourLoops[i] + " " + times[j]); 
        
    }
    
}