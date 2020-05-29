package vehicles;
class Automobile { 
    private final String drive() 
    { 
        return "Driving vehicle"; 
        
    }
    
}
class Car extends Automobile { 
    protected String drive() 
    { return "Driving car"; }
    
}
public class ElectricCar extends Car { 
    public final String drive() 
    { 
        return "Driving electric car"; 
        
    } 
    public static void main(String[] wheels) 
    { 
        final Car car = new ElectricCar(); 
        System.out.print(car.drive()); //Main () y�nteminde, olu�turulan nesne bir ElectricCar, bir car referans�na atanm�� olsa bile, Polimorfizm nedeniyle, ElectricCar'dan y�ntem �a�r�l�r ve Se�enek B do�ru cevap haline getirilir.
        
    }
    
}