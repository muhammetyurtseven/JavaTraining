package radio;
public class Song {
    public void playMusic() // iki tane playMusic() oldugundan kod derlenmez.
    { 
        System.out.print("Play!"); 
        
    } 
    private static int playMusic() 
    { 
        System.out.print("Music!"); 
        
    } 
    public static void main(String[] tracks) 
    { 
        new Song().playMusic();
        }
    
}