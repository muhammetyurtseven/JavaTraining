package pond;
abstract class Duck { 
    protected int count; 
    public abstract int getDuckies();
    
}


 
public class Ducklings extends Duck { 
    private int age; 
    public Ducklings(int age) { 
        this.age = age; 
        
    } 
    public int getDuckies() {
        return this.age/count; } 
        public static void main(String[] pondInfo) { 
            Duck itQuacks = new Ducklings(5); 
            System.out.print(itQuacks.getDuckies()); 
            //Kod sorunsuz derlenir, bu nedenle Se�enek C yanl��t�r. Buradaki anahtar, bir �rnek de�i�keni olan count de�erinin 0 de�eriyle ba�lat�ld���n� fark eder. GetDuckies () y�ntemi, �al��ma zaman�nda denetlenmeyen bir ArithmeticException �zelli�ine yol a�an 5/0 bilgisayar�n� bitirir ve Se�enek D'yi do�ru yan�t haline getirir.Kod derlenir, ancak �al��ma zaman�nda bir istisna atar.
        }}