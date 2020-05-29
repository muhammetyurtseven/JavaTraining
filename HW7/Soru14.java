package track;
interface Run {
 default void walk() { 
     System.out.print("Walking and running!"); 
     
 }
    
}
interface Jog { 
    default void walk() {
        System.out.print("Walking and jogging!"); 
        
    }
    
} 
public class Sprint implements Run, Jog { 
    public void walk() { System.out.print("Sprinting!"); //Derlenir ve sonu� olaraak Sprinting! ��kar.Bir s�n�f�n her ikisini de ayn� tan�mlayan iki arabirim uygulamas� s�n�f varsay�lan y�ntemi ge�ersiz k�lmad��� s�rece, varsay�lan y�ntem imzas� bir derleyici hatas�na yol a�ar. Bu durumda, Sprint s�n�f� walk () y�ntemini do�ru �ekilde ge�ersiz k�lar, bu nedenle kod sorunsuz derlenir ve Se�enek C do�rudur.
        
    } 
    public static void main(String[] args) { new Sprint().walk();
    }
    
}