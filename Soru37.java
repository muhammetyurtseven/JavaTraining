public class InitOrder {
    
public String first="instance"; // ilk de�er olarak bunu �al��t�r�r.
    
	public InitOrder() 
	{
        first="constructor";
    
	}
   
 	{
        first="block"; // 2.olarak buras� �al���p first="block" de�erini al�r ve ekrana basar.
    
		}
   
	 public void print(){
       
 	System.out.println(first);
    
	}
    public static void main(String... args)
	{
        new InitOrder().print(); // InitOrder'da ki first de�i�keni �a�r�l�r ve ekrana constructor basar.
   
	}

}