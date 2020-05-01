package beach;
public class Sand 
{ 
    public Sand() { 
    System.out.print("a"); //ilk önce ana main çalýþacaktýr.
        
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
    new Sand().run(); //2. olarak run metodu çaðýrýlýr ve tekrar Sand() çalýþtýgý için a basar 
    
}}