package game;
public class BasketBall { 
    public static void main(String[] dribble) { 
        try { System.out.print(1); 
        throw new ClassCastException(); 
            
        } 
        catch (ArrayIndexOutOfBoundsException ex) { 
            System.out.print(2); } catch (Throwable ex) { 
                System.out.print(3); 
                
            } 
            finally { System.out.print(4); 
                
            } 
            System.out.print(5); //Kod derleme ve sorunsuz çalýþýr, bu nedenle Seçenekler C ve D yanlýþtýr. Try bloðu bir ClassCastException kurar. ClassCastException, ArrayIndexOutOfBoundsException öðesinin bir alt sýnýfý olmadýðýndan, ilk catch bloðu atlanýr. Ýkinci catch bloðu için ClassCastException, Throwable'ýn bir alt sýnýfýdýr, böylece blok yürütülür. Daha sonra, nihayet blok yürütülür ve sonra kontrol exception olmadan main () yöntemine döner. Sonuç olarak 1345 yazdýrýlýr ve  A doðru cevap olur.
        
    }
    
}