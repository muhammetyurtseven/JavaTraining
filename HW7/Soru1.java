package theater;
class Cinema { 
    private String name; 
    public Cinema(String name) {this.name = name;}
    
}
public class Movie extends Cinema { 
    public Movie(String movie) {} //name deðiþkeni private oldugu için movie sýnýfýndan eriþilemez.
    public static void main(String[] showing) { 
        System.out.print(new Movie("Another Trilogy").name); // otomatik olarak super() ekleyemeceði için burda hata verir.
        
    }
    
}