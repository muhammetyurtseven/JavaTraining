package machines;
class Computer { 
    protected final int process() { return 5; } //Process () y�ntemi, Computer s�n�f�nda son olarak bildirilir.Laptop s�n�f� daha sonra bu y�ntemi ge�ersiz k�lmaya �al���r ve derleme hatas�na neden olarak Se�enek C'yi do�ru yan�t haline getirir.
    
}
public class Laptop extends Computer { 
    public final int process() { return 3; }
    public static void main(String[] chips) 
    { 
        System.out.print(new Laptop().process());


 
 }}