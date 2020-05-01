package registration;
public class NameCheck { 
    public static void main(String... data) { 
        String john = "john"; 
        String jon = new String(john); 
        System.out.print((john==jon)+" "+(john.equals(jon))); // john==jon olmadýðý için ilkini false atar. Ýkincisi ise ayný deðerler oldugu icin true þeklinde yani false true þeklinde ekrana basar.
        
    }
    
}
    