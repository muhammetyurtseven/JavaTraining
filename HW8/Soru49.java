package storage;
import java.io.*;
public class Backup { 
    public void performBackup() { 
        try { throw new IOException("Disk not found"); 
            
        } 
        catch (Exception e) { 
            try { throw new FileNotFoundException("File not found"); 
                
            } catch (FileNotFoundException a) { // z1 Bir catch blo�unun g�m�l� bir try-catch blo�u i�ermesine izin verilirken, buradaki sorun, e de�i�ken ad�n�n ilk catch blo�u taraf�ndan zaten kullan�lm�� olmas�d�r. �kinci yakalama blo�unda, bir e de�i�kenini iki kez bildirmeye e�de�erdir. Bu nedenle, z1 sat�r� derlenmez ve Se�enek C do�ru cevapt�r. Her iki catch blo�u i�in farkl� bir de�i�ken ad� kullan�lm��sa, kod sorunsuz bir �ekilde derlenir ve Se�enek A do�ru cevap olacakt�r.
            System.out.print("Failed"); } } } 
            public static void main(String... files) { new Backup().performBackup(); // z2
            }}