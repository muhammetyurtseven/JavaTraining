public class MyClass {
public static void main(String[] args) { 
    List<String> bottles = Arrays.asList("glass", "plastic"); 
    for (int type = 0; type < bottles.size();) 
    { 
        System.out.print(bottles.get(type) + ","); 
        break; 
        
    } 
        System.out.print("end");//for d�ng� i�ersinden glass ekrana basar sonra gelir yan�na buradan end ��kt�s�n� yazd�r�r. glass,end
    
}
}