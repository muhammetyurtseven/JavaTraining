public class Shoelaces { 
    public static void main(String[] args) { 
     boolean baloonInflated = false;
     do { if (!baloonInflated) {
         baloonInflated = true; 
     System.out.print("inflate-"); //bunu yazd�rma baslar ve daha hep true oldugundan d�ng� sona ermez.
         
     }
         
     } while (baloonInflated);
     System.out.println("done");
        
    }
    
}