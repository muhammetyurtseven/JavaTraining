package wrap;
public class Gift { 
    private final Object contents; 
    protected Object getContents() { return contents; } 
    protected void setContents(Object contents) { this.contents = contents; } //contents de�eri burda sabitlendi ama a�a��dan yeni bir contents de�eri gelce�inden program �al��maz.
    public void showPresent() { 
        System.out.print("Your gift: "+contents); 
        
    } 
    public static void main(String[] treats) {
        Gift gift = new Gift(); 
        gift.setContents(gift); 
        gift.showPresent(); 
        
    }
    
}