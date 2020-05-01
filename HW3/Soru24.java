package dessert;
public class IceCream { 
    public final static void main(String... args) { 
        int flavors = 30; 
        int eaten = 0; 
        switch(flavors) {
            case 30: eaten++; // ilk önce burasý eaten 1
            case 40: eaten+=2; // sonra eaten 3
            default: eaten--; //burada eaten 2 olacaktýr.
            
        } 
        System.out.print(eaten); 
        
    }
    
}