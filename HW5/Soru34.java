public class HelloWorld{

     public static void main(String[] args) { 
         String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
         String[] times = new String[] { "Day", "Night" };
         for (int i = 0, j = 0; i < nycTourLoops.length && j < times.length; i++, j++) //Burada sondaki i++ ve j++ de�er g�ncellemeleri aras�nda ";" kullan�lmaz "," kullan�ld�g�nda kod derlenir ve  cevap Downtown Day-Uptown Night- gelecektir.
         { 
             System.out.print(nycTourLoops[i] + " " + times[j] + "-");
             
         }
         
     }
}