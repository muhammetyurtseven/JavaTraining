public class Shoelaces { 
    public static void main(String[] args) { 
        String race = "";
        loop:
        do {
            race += "x";
            break loop;
            } while (true);
            System.out.println(race); // silinmedi�i zaman cevap x gelecektir. silindi�i zamanda kod derlenmez.
        
    }
    
}