package harbor;
class CapsizedException extends Exception {}
class Transport { 
    public int travel() throws CapsizedException { 
        return 2; 
        
    };}
    public class Boat { public int travel() throws Exception { return 4; }; // j1 
    public static void main(String... distance) throws Exception{
        try { System.out.print(new Boat().travel()); }
        catch (Exception e) { System.out.print(8); } }} // burada {} kullanmak yerine () kullan�ld�g� i�in derlenmemektedir. {} bunlar oldugunda derlenir ve cevap 4 c�kacakt�r.