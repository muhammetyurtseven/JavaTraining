package dinosaur;
public class Park { 
    public final static void main(String... arguments) 
    { 
    int pterodactyl = 6; 
    long triceratops = 3; 
    if(pterodactyl % 3 >= 1) triceratops++; triceratops--; //6 de�erinin modunu ald���m�z zaman 0 gelecektir. Sa� taraf �al��aca��ndan dolay� cevap 2dir.
    System.out.print(triceratops);
    }
    
}