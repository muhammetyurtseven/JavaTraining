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
        new Bond().sell(); //Sell () yöntemi, derlemez çünkü if-else ifadelerinin her iki koþullu ifadesi de yanlýþ. Çünkü Mantýksal olarak, fiyatýn 10'dan küçük veya 10'dan büyük veya ona eþit olmasý gerekir ama derleyici bunu bilmez. Sadece eðer if-else ifadelerinin her ikisi de false olarak deðerlendirilirse, o zaman bir dönüþ deðerinin olmadýðýný, bu nedenle derlemediðini bilir.
        new Bond().sell(); 
        new Bond().sell(); 
        System.out.print(price); 
        
    }
    
}