package dinosaur;
public class Park { 
    public final static void main(String... arguments) 
    { 
    int pterodactyl = 6; 
    long triceratops = 3; 
    if(pterodactyl % 3 >= 1) triceratops++; triceratops--; //6 deðerinin modunu aldýðýmýz zaman 0 gelecektir. Sað taraf çalýþacaðýndan dolayý cevap 2dir.
    System.out.print(triceratops);
    }
    
}