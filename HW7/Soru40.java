
class Math { 
    public final double secret = 2;
    
}
class ComplexMath extends Math { 
    public final double secret = 4;
    
}
public class InfiniteMath extends ComplexMath { 
    public final double secret = 8; 
    public static void main(String[] numbers) { 
        Math math = new InfiniteMath(); 
        System.out.print(math.secret); //referans tipi se�ilen gizli de�i�kenin versiyonunu belirler, bu da ��kt� 2 verir.
        
    }}