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
    new Attendance().printTodaysCount(); //Listenin de�eri null ise bir NullPointerException atanabilir. Benzer �ekilde, listenin de�eri 10'dan az ��e i�eren bir dizi ise ArrayIndexOutOfBoundsException durumu olu�turulabilir. Son olarak,Listeye Boolean [] t�r�nde olmayan bir nesne atanm��sa ClassCastException atanabilir. �rne�in, atama listesi = (Boolean []) new Object () sorunsuz derlenir, ancak �al��ma zaman�nda bir ClassCastException olu�turur. Bu nedenle, ilk �� se�enek m�mk�nd�r ve Se�enek D'yi do�ru cevap haline getirir.
    
}
    
}