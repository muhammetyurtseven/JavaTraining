package chicago;
public class Loop { 
    private static int count; //Bir sýnýf degiþkeni oldugundan deðeri 0'dýr.
    private static String[] stops = new String[] { "Washington", "Monroe", "Jackson", "LaSalle" }; 
    public static void main(String[] args) { 
        while (count < stops.length) { //burada ilk karakter "Washington" 11 karakter oldugundan aþaðýda ki if iþlemez ve count 1 olur.
            if (stops[count++].length() < 8) { break; } } // count 1 oldugundan burasý "Monroe" 6 karakter olacagýndan burasý iþlenir. Program break komutuyla çýktý yazdýrýr ve 2 tane olacaktýr.
            System.out.println(count); 
        
    }
    
}