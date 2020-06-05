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
            System.out.print(5); //Kod derleme ve sorunsuz �al���r, bu nedenle Se�enekler C ve D yanl��t�r. Try blo�u bir ClassCastException kurar. ClassCastException, ArrayIndexOutOfBoundsException ��esinin bir alt s�n�f� olmad���ndan, ilk catch blo�u atlan�r. �kinci catch blo�u i�in ClassCastException, Throwable'�n bir alt s�n�f�d�r, b�ylece blok y�r�t�l�r. Daha sonra, nihayet blok y�r�t�l�r ve sonra kontrol exception olmadan main () y�ntemine d�ner. Sonu� olarak 1345 yazd�r�l�r ve  A do�ru cevap olur.
        
    }
    
}