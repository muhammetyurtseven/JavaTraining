package flying; 
class Rotorcraft {//Rotorcraft s�n�f� soyut bir y�ntem i�erir, ancak s�n�f�n kendisi soyut olarak i�aretlenmez. Yaln�zca arabirimler ve soyut s�n�flar soyut y�ntemler i�erebilir.Bunedenle cevap C.
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