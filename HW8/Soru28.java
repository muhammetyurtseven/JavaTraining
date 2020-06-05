package peculiar;
public class Stranger { 
    public static String getFullName(String firstName, String lastName) { 
        try { 
            return firstName.toString() + " " + lastName.toString(); 
            
        }
        catch (NullPointerException npe) { 
            System.out.print("Problem?"); 
            
        }  //catch ve finally yanlýþ sýralamada oldugundan derlenmez ama sýrasýný bu þekilde yaptýgýmýzda Finished!Joyce Hopper cýktýsýný verecektir.
        finally { 
            System.out.print("Finished!");
            } 
        
        return null;
    } public static void main(String[] things) { 
            System.out.print(getFullName("Joyce","Hopper")); 
            
        }
    
}