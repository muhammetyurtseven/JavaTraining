package checkboard; 
public class Attendance { private Boolean[] list = // value omitted 
public int printTodaysCount() { 
    int count=0; for(int i=0; i<10; i++) 
    { 
        if(list[i]) ++count; 
        
    } 
    return count; 
    
} 
public static void main(String[] roster) { 
    new Attendance().printTodaysCount(); //Listenin deðeri null ise bir NullPointerException atanabilir. Benzer þekilde, listenin deðeri 10'dan az öðe içeren bir dizi ise ArrayIndexOutOfBoundsException durumu oluþturulabilir. Son olarak,Listeye Boolean [] türünde olmayan bir nesne atanmýþsa ClassCastException atanabilir. Örneðin, atama listesi = (Boolean []) new Object () sorunsuz derlenir, ancak çalýþma zamanýnda bir ClassCastException oluþturur. Bu nedenle, ilk üç seçenek mümkündür ve Seçenek D'yi doðru cevap haline getirir.
    
}
    
}