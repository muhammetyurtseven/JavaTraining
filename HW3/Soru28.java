package city;
public class Road {
    public static void main(String... in) {
        int intersections = 100; 
        int streets = 200; 
        if (intersections < 150) 
        { System.out.print("1"); }
        else if (streets > 1000 && intersections > 1000) // bu ifade yanl��t�r. E�er bu ifade streets > 1000 && intersections > 1000 olsayd� sonu� verecekti.Do�ru olan yap�lm�� olup sonu� iki tane 1 �retecektir.
        { System.out.print("2"); } 
        if (streets < 500) System.out.print("1"); 
        else System.out.print("2");
        }
    
}