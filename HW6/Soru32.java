package sky;
public class Stars { 
    private int inThe = 4; 
    public void Stars() { //burasıı void oldugundan bir yöntemdir. bu nedenle super() sadece yapıcılar tarafından çağrılacagından burada hata verir
        super(); 
        
    } 
    public Stars(int inThe) { 
        this.inThe = this.inThe; 
        
    } 
    public static void main(String[] endless) { 
        System.out.print(new sky.Stars(2).inThe); 
        
    }
    
}