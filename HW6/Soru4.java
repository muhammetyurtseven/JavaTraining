package figures;public class Dolls {
 
 public void nested() { nested(2,true); } // g1 buralar derlenir.��nk� farkl� girdi ba��ms�z de�i�kenler al�r.
 public int nested(int level, boolean height) { return nested(level); } 
 public int nested(int level) { return level+1; }; // g2 
 public static void main(String[] outOfTheBox) { 
     System.out.print(new Dolls().nested()); //buras� derlenmez.nested () y�nteminin ba��ms�z de�i�ken , de�eri geri d�nd�rmez ve print () y�nteminde bir ge�ersiz d�n�� t�r� ��karmaya �al��t�g�ndan hata verir.
     
 }
    
}