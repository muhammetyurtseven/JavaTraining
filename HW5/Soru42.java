public class Deneme { 
    public static void main(String[] args) { 
       
       String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
       String[] times = new String[] { "Day", "Night" };
       for (int i = 0, j = 0; i < nycTourLoops.length && j < times.length; i++, j++)
       { 
           System.out.print(nycTourLoops[i] + " " + times[j] + "-"); // Program sorunsuz derlenir. �lk 2 �al��aca��ndan sonu� Downtown Day-Uptown Night- ��kacakt�r.
           
       }
        
    }
    
}