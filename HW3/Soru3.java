package registration;
public class NameCheck { 
    public static void main(String... data) { 
        String john = "john"; 
        String jon = new String(john); 
        System.out.print((john==jon)+" "+(john.equals(jon))); // john==jon olmad��� i�in ilkini false atar. �kincisi ise ayn� de�erler oldugu icin true �eklinde yani false true �eklinde ekrana basar.
        
    }
    
}
    