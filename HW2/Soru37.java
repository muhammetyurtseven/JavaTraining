public class InitOrder {
    
public String first="instance"; // ilk deðer olarak bunu çalýþtýrýr.
    
	public InitOrder() 
	{
        first="constructor";
    
	}
   
 	{
        first="block"; // 2.olarak burasý çalýþýp first="block" deðerini alýr ve ekrana basar.
    
		}
   
	 public void print(){
       
 	System.out.println(first);
    
	}
    public static void main(String... args)
	{
        new InitOrder().print(); // InitOrder'da ki first deðiþkeni çaðrýlýr ve ekrana constructor basar.
   
	}

}