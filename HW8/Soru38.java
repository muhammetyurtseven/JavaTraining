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
            try { new Heart().operate(); } finally { } //kod derlenmez. operate () y�ntemi Ge�ersiz k�l�nan bir y�ntem, devral�nd��� y�ntemden daha yeni veya daha geni� denetimli istisnalar atmamal�d�r. RuntimeException �zel durumunun bir alt s�n�f� olmas�na ra�men, RuntimeException denetlenmeyen bir �zel durum oldu�undan, Exception yeni denetlenen bir �zel durum olarak kabul edilir. Bu nedenle, kod derlenmez ve se�enek C do�rudur
            
        }
    
}