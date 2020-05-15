public class Shoelaces { 
    public static void main(String[] args) { 
        String race = "";
        loop:
        do {
            race += "x";
            break loop;
            } while (true);
            System.out.println(race); // silinmediði zaman cevap x gelecektir. silindiði zamanda kod derlenmez.
        
    }
    
}