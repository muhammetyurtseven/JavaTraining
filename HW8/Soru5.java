package game;
public class Baseball { 
    public static void main(String... teams) { 
        try { 
            int score = 1; 
            System.out.print(score++); 
            
        } 
        catch (Throwable t) { 
            System.out.print(score++); 
            
        } 
        finally { System.out.print(score++); } 
        System.out.print(score++); 
        //Uygulama yaln�zca derleme blo�unda tan�mland���ndan derlenmez.
    }
    
}