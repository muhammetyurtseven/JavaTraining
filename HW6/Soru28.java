package wrap;
public class Gift { 
    private final Object contents; 
    protected Object getContents() { return contents; } 
    protected void setContents(Object contents) { this.contents = contents; } //contents deðeri burda sabitlendi ama aþaðýdan yeni bir contents deðeri gelceðinden program çalýþmaz.
    public void showPresent() { 
        System.out.print("Your gift: "+contents); 
        
    } 
    public static void main(String[] treats) {
        Gift gift = new Gift(); 
        gift.setContents(gift); 
        gift.showPresent(); 
        
    }
    
}