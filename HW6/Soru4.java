package figures;public class Dolls {
 
 public void nested() { nested(2,true); } // g1 buralar derlenir.çünkü farklý girdi baðýmsýz deðiþkenler alýr.
 public int nested(int level, boolean height) { return nested(level); } 
 public int nested(int level) { return level+1; }; // g2 
 public static void main(String[] outOfTheBox) { 
     System.out.print(new Dolls().nested()); //burasý derlenmez.nested () yönteminin baðýmsýz deðiþken , deðeri geri döndürmez ve print () yönteminde bir geçersiz dönüþ türü çýkarmaya çalýþtýgýndan hata verir.
     
 }
    
}