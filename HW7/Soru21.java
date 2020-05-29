package paper; 
abstract class Book { 
    protected static String material = "papyrus"; 
    public Book() {} public Book(String material) 
    {this.material = material;}
    
}
public class Encyclopedia extends Book { 
    public static String material = "cellulose"; 
    public Encyclopedia() {super();} 
    public String getMaterial() {return super.material;} 
    public static void main(String[] pages) { 
        System.out.print(new Encyclopedia().getMaterial()); //super de�i�keni getMaterial () ��esinde eri�mek i�in kullan�ld���ndan, papyrus de�eri d�nd�r�l�r ve Se�enek A do�ru yan�t haline gelir.
        }
    
}