package mind;
public class Remember {
    public static void think() throws Exception { // k1 
    try { //Bir try blo�u ya catch ya da finaly blo�u ya da her ikisini i�ermelidir. bu nedenle derlenmez.
        throw new Exception();
    } 
        
    } 
    public static void main(String... ideas) throws Exception { think(); }}