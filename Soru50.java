package beach;
public class Sand 
{ 
    public Sand() { 
    System.out.print("a"); //ilk �nce ana main �al��acakt�r.
        
    } 
public void Sand() 
{ 
    System.out.print("b"); // en son b basarak program biter.
    
} 
public void run() 
{ 
    new Sand(); Sand(); 
    
} 
public static void main(String... args)
{ 
    new Sand().run(); //2. olarak run metodu �a��r�l�r ve tekrar Sand() �al��t�g� i�in a basar 
    
}}