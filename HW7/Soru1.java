package theater;
class Cinema { 
    private String name; 
    public Cinema(String name) {this.name = name;}
    
}
public class Movie extends Cinema { 
    public Movie(String movie) {} //name de�i�keni private oldugu i�in movie s�n�f�ndan eri�ilemez.
    public static void main(String[] showing) { 
        System.out.print(new Movie("Another Trilogy").name); // otomatik olarak super() ekleyemece�i i�in burda hata verir.
        
    }
    
}