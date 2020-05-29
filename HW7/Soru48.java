package orchestra;
interface MusicCreator { 
    public Number play(); 
    
}
abstract class StringInstrument { 
    public Long play() {return 3L;} 
    
}
public class Violin extends StringInstrument implements MusicCreator { 
    public Long play() { return 12L; } // Hepsinde de kod derlenmedi
    
}
