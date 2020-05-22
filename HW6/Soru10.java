package games;
public class Jump { 
    private int rope = 1; 
    protected boolean outside; //ilk deðeri falsedýr.
    public Jump() { 
        // p1   Bu nedenle, this (4) ipin 5'e ayarlanmasýna neden olurken, bu this(5) ipin 6'ya ayarlanmasýna neden olacaktýr. 5 aradýðýmýz sayý olduðundan, Seçenek A doðrudur ve Seçenek C yanlýþtýr.
        outside = true; 
        
    } 
    public Jump(int rope) { 
        this.rope = outside ? rope : rope+1; 
        
    } 
    public static void main(String[] bounce) {
        System.out.print(new Jump().rope); 
    }
    
}