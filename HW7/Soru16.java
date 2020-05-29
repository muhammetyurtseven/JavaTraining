package transport; 
class Ship { 
    protected int weight = 3; 
    private int height = 5; 
    public int getWeight() { return weight; } 
    public int getHeight() { return height; }
    
} 
public class Rocket extends Ship { 
    public int weight = 2; 
    public int height = 4; 
    public void printDetails() { 
        System.out.print(super.getWeight()+","+super.height); //Kod derlenmez, çünkü super.height, Rocket sýnýfýnda görünmez ve bu da Seçenek D'yi doðru yanýt yapar.
        
    } 
    public static final void main(String[] fuel) 
    { 
        new Rocket().printDetails(); 
        
    }
    
}