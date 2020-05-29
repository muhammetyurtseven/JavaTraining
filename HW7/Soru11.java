package machines;
class Computer { 
    protected final int process() { return 5; } //Process () yöntemi, Computer sýnýfýnda son olarak bildirilir.Laptop sýnýfý daha sonra bu yöntemi geçersiz kýlmaya çalýþýr ve derleme hatasýna neden olarak Seçenek C'yi doðru yanýt haline getirir.
    
}
public class Laptop extends Computer { 
    public final int process() { return 3; }
    public static void main(String[] chips) 
    { 
        System.out.print(new Laptop().process());


 
 }}