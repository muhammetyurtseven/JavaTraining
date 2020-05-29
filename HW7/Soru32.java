package flying; 
class Rotorcraft {//Rotorcraft sýnýfý soyut bir yöntem içerir, ancak sýnýfýn kendisi soyut olarak iþaretlenmez. Yalnýzca arabirimler ve soyut sýnýflar soyut yöntemler içerebilir.Bunedenle cevap C.
    protected final int height = 5; 
    abstract int fly();
    
}
public class Helicopter extends Rotorcraft {
    private int height = 10; 
    protected int fly() { return super.height; } 
    public static void main(String[] unused) { 
        Helicopter h = (Helicopter)new Rotorcraft(); 
        System.out.print(h.fly()); 
        
    }
    
}