package pet;
public class Puppy {
    public static int wag = 5; // q1 
    public void Puppy(int wag) { // q2
    this.wag = wag; } 
    public static void main(String[] tail) { 
        System.out.print(new Puppy(2).wag); // q3 Puppy s�n�f� bir kurucu bildirmez, bu nedenle varsay�lan arg�man yap�c� derleyici taraf�ndan otomatik olarak eklenir. Bu nedenle, new Puppy(2) nesnesini olu�turmak i�in main () y�ntemindeki sat�r derlenmez, ��nk� int de�erini alabilen ve D Se�ene�ini do�ru yan�t yapan bir kurucu yoktur.
        }
    
}