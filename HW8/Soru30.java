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
            //Kod sorunsuz derlenir, bu nedenle Seçenek C yanlýþtýr. Buradaki anahtar, bir örnek deðiþkeni olan count deðerinin 0 deðeriyle baþlatýldýðýný fark eder. GetDuckies () yöntemi, çalýþma zamanýnda denetlenmeyen bir ArithmeticException özelliðine yol açan 5/0 bilgisayarýný bitirir ve Seçenek D'yi doðru yanýt haline getirir.Kod derlenir, ancak çalýþma zamanýnda bir istisna atar.
        }}