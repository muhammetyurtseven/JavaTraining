package animal;
interface CanFly { //soyut olduðu varsayýlamayacaðý anlamýna gelen animasyonu tanýmlar; bu nedenle kod derlenmez. 
    public void fly() {}
    
}
final class Bird { 
    public int fly(int speed) {} //tanýmalamadan dolayý
    
}
public class Eagle extends Bird implements CanFly { //Eagle sýnýfý derlenmez çünkü final olarak iþaretlenen ve bu nedenle geniþletilemeyen Bird sýnýfýný geniþletir.
    public void fly() {}
    
}