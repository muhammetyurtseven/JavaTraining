package sky;
public class Stars { 
    private int inThe = 4; 
    public void Stars() { //buras�� void oldugundan bir y�ntemdir. bu nedenle super() sadece yap�c�lar taraf�ndan �a�r�lacag�ndan burada hata verir
        super(); 
        
    } 
    public Stars(int inThe) { 
        this.inThe = this.inThe; 
        
    } 
    public static void main(String[] endless) { 
        System.out.print(new sky.Stars(2).inThe); 
        
    }
    
}