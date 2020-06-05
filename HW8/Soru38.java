package body;
class Organ { 
    public void operate() throws RuntimeException { 
        throw new RuntimeException("Not supported"); 
        
    }
    
}
public class Heart extends Organ { 
    public void operate() throws Exception { 
        System.out.print("beat"); 
        
    } 
        public static void main(String... cholesterol) throws Exception { 
            try { new Heart().operate(); } finally { } //kod derlenmez. operate () yöntemi Geçersiz kýlýnan bir yöntem, devralýndýðý yöntemden daha yeni veya daha geniþ denetimli istisnalar atmamalýdýr. RuntimeException özel durumunun bir alt sýnýfý olmasýna raðmen, RuntimeException denetlenmeyen bir özel durum olduðundan, Exception yeni denetlenen bir özel durum olarak kabul edilir. Bu nedenle, kod derlenmez ve seçenek C doðrudur
            
        }
    
}