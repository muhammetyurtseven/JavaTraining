package games;
public class Jump { 
    private int rope = 1; 
    protected boolean outside; //ilk de�eri falsed�r.
    public Jump() { 
        // p1   Bu nedenle, this (4) ipin 5'e ayarlanmas�na neden olurken, bu this(5) ipin 6'ya ayarlanmas�na neden olacakt�r. 5 arad���m�z say� oldu�undan, Se�enek A do�rudur ve Se�enek C yanl��t�r.
        outside = true; 
        
    } 
    public Jump(int rope) { 
        this.rope = outside ? rope : rope+1; 
        
    } 
    public static void main(String[] bounce) {
        System.out.print(new Jump().rope); 
    }
    
}