package stocks;
public class Bond { 
    private static int price = 5; 
    public boolean sell() { 
        if(price<10) { 
            price++; 
            return true; 
            
        } 
        else if(price>=10) { return false; } 
        
    } 
    public static void main(String[] cash) 
    { 
        new Bond().sell(); //Sell () y�ntemi, derlemez ��nk� if-else ifadelerinin her iki ko�ullu ifadesi de yanl��. ��nk� Mant�ksal olarak, fiyat�n 10'dan k���k veya 10'dan b�y�k veya ona e�it olmas� gerekir ama derleyici bunu bilmez. Sadece e�er if-else ifadelerinin her ikisi de false olarak de�erlendirilirse, o zaman bir d�n�� de�erinin olmad���n�, bu nedenle derlemedi�ini bilir.
        new Bond().sell(); 
        new Bond().sell(); 
        System.out.print(price); 
        
    }
    
}