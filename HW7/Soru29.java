package sports;
abstract class Ball { 
    protected final int size; 
    public Ball(int size) { this.size = size; }
    
}
interface Equipment {}
public class SoccerBall extends Ball implements Equipment { 
    public SoccerBall() { super(5); } 
    public Ball get() { return this; } 
    public static void main(String[] passes) { 
        Equipment equipment = (Equipment)(Ball)new SoccerBall().get(); 
        System.out.print(((SoccerBall)equipment).size); //�al��ma zaman�nda,bu nesne okunabilir, ��nk� nesne, bir SoccerBall'dir. Ba�ka bir deyi�le, onu farkl� bir referans de�i�kenine d�n��t�rmek nesneyi de�i�tirmez veya temeldeki SoccerBall bilgilerini kaybetmesine neden olmaz. Bu nedenle cevap 5tir.
        
    }}