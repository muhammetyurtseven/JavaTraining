package peculiar;
public class Stranger { 
    public static String getFullName(String firstName, String lastName) { 
        try { 
            return firstName.toString() + " " + lastName.toString(); 
            
        }
        catch (NullPointerException npe) { 
            System.out.print("Problem?"); 
            
        }  //catch ve finally yanl�� s�ralamada oldugundan derlenmez ama s�ras�n� bu �ekilde yapt�g�m�zda Finished!Joyce Hopper c�kt�s�n� verecektir.
        finally { 
            System.out.print("Finished!");
            } 
        
        return null;
    } public static void main(String[] things) { 
            System.out.print(getFullName("Joyce","Hopper")); 
            
        }
    
}