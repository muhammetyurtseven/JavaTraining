package planning;
public class ThePlan { 
    public static void main(String[] input) { 
        int plan = 1; 
        plan = plan++ + --plan; 
        if(plan==1) { 
            System.out.print("Plan A"); 
            } else { if(plan==2) System.out.print("Plan B"); // buras� else i�inde bir if kullan�l�r ve  yukardaki if d�ng�s� ile �ak��t���  i�in hata verir
            
            } else System.out.print("Plan C"); 
        
    }
    
}