package party; 
abstract class House {
    protected abstract Object getSpace();
    
}
abstract class Room extends House { 
    abstract Object getSpace(Object list);
    
}
abstract public class Ballroom extends House { 
    protected abstract Object getSpace(); 
    public static void main(String[] squareFootage) {
        System.out.print("Let's start the party!"); //kod hata vermedi ama ekranda bir ��kt� da vermedi.
        
    }
    
}