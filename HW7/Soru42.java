public class Canine {}
public class Dog extends Canine {}
public class Wolf extends Canine {}
public final class Husky extends Dog {}
public class Zoologist { 
    Canine animal; 
    public final void setAnimal(Dog animal) { this.animal = animal; } 
    public static void main(String[] furryFriends) { 
        new Zoologist().setAnimal(new Wolf()); //C seçeneði kodun derlenmesini engelleyen tek deðerdir çünkü Wolf Dog'un bir alt sýnýfý deðildir.
        
    }
    
}