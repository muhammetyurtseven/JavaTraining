package planning;
public class ThePlan { 
    public static void main(String[] input) { 
        int plan = 1; 
        plan = plan++ + --plan; 
        if(plan==1) { 
            System.out.print("Plan A"); 
            } else { if(plan==2) System.out.print("Plan B"); // burasý else içinde bir if kullanýlýr ve  yukardaki if döngüsü ile çakýþtýðý  için hata verir
            
            } else System.out.print("Plan C"); 
        
    }
    
}