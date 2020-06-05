package mind;
public class Remember {
    public static void think() throws Exception { // k1 
    try { //Bir try bloðu ya catch ya da finaly bloðu ya da her ikisini içermelidir. bu nedenle derlenmez.
        throw new Exception();
    } 
        
    } 
    public static void main(String... ideas) throws Exception { think(); }}