package animal;
interface CanFly { //soyut oldu�u varsay�lamayaca�� anlam�na gelen animasyonu tan�mlar; bu nedenle kod derlenmez. 
    public void fly() {}
    
}
final class Bird { 
    public int fly(int speed) {} //tan�malamadan dolay�
    
}
public class Eagle extends Bird implements CanFly { //Eagle s�n�f� derlenmez ��nk� final olarak i�aretlenen ve bu nedenle geni�letilemeyen Bird s�n�f�n� geni�letir.
    public void fly() {}
    
}