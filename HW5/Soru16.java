package chicago;
public class Loop { 
    private static int count; //Bir s�n�f degi�keni oldugundan de�eri 0'd�r.
    private static String[] stops = new String[] { "Washington", "Monroe", "Jackson", "LaSalle" }; 
    public static void main(String[] args) { 
        while (count < stops.length) { //burada ilk karakter "Washington" 11 karakter oldugundan a�a��da ki if i�lemez ve count 1 olur.
            if (stops[count++].length() < 8) { break; } } // count 1 oldugundan buras� "Monroe" 6 karakter olacag�ndan buras� i�lenir. Program break komutuyla ��kt� yazd�r�r ve 2 tane olacakt�r.
            System.out.println(count); 
        
    }
    
}