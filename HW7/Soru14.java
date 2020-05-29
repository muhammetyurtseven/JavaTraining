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
    public void walk() { System.out.print("Sprinting!"); //Derlenir ve sonuç olaraak Sprinting! çýkar.Bir sýnýfýn her ikisini de ayný tanýmlayan iki arabirim uygulamasý sýnýf varsayýlan yöntemi geçersiz kýlmadýðý sürece, varsayýlan yöntem imzasý bir derleyici hatasýna yol açar. Bu durumda, Sprint sýnýfý walk () yöntemini doðru þekilde geçersiz kýlar, bu nedenle kod sorunsuz derlenir ve Seçenek C doðrudur.
        
    } 
    public static void main(String[] args) { new Sprint().walk();
    }
    
}