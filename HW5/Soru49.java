public class Shoelaces { 
    public static void main(String[] args) { 
     boolean baloonInflated = false;
     do { if (!baloonInflated) {
         baloonInflated = true; 
     System.out.print("inflate-"); //bunu yazdýrma baslar ve daha hep true oldugundan döngü sona ermez.
         
     }
         
     } while (baloonInflated);
     System.out.println("done");
        
    }
    
}