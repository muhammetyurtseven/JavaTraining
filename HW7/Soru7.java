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
        System.out.print(car.drive()); //Main () yönteminde, oluþturulan nesne bir ElectricCar, bir car referansýna atanmýþ olsa bile, Polimorfizm nedeniyle, ElectricCar'dan yöntem çaðrýlýr ve Seçenek B doðru cevap haline getirilir.
        
    }
    
}