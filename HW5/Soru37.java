public class Shoelaces { 
    public static void main(String[] args) { 
        String race = "";
        loop:
        do {
            race += "x";
            break loop;
            } while (true);
            System.out.println(race); // silinmediği zaman cevap x gelecektir. silindiği zamanda kod derlenmez.
        
    }
    
}