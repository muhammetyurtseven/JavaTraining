package storage;
import java.io.*;
public class Backup { 
    public void performBackup() { 
        try { throw new IOException("Disk not found"); 
            
        } 
        catch (Exception e) { 
            try { throw new FileNotFoundException("File not found"); 
                
            } catch (FileNotFoundException a) { // z1 Bir catch bloðunun gömülü bir try-catch bloðu içermesine izin verilirken, buradaki sorun, e deðiþken adýnýn ilk catch bloðu tarafýndan zaten kullanýlmýþ olmasýdýr. Ýkinci yakalama bloðunda, bir e deðiþkenini iki kez bildirmeye eþdeðerdir. Bu nedenle, z1 satýrý derlenmez ve Seçenek C doðru cevaptýr. Her iki catch bloðu için farklý bir deðiþken adý kullanýlmýþsa, kod sorunsuz bir þekilde derlenir ve Seçenek A doðru cevap olacaktýr.
            System.out.print("Failed"); } } } 
            public static void main(String... files) { new Backup().performBackup(); // z2
            }}