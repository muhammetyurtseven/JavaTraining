public class ChooseWisely { 
    public ChooseWisely() 
    { 
        super();
    } 
    public int choose(int choice) 
    { 
        return 5; 
        
    } 
    public int choose(short choice) 
    { 
        return 2; 
        
    } 
    public int choose(long choice) 
    { 
        return 11; 
        
    } 
    public static void main(String[] path) { 
        System.out.print(new ChooseWisely().choose((byte)2+1));//burda byte de�eri otomatik olarak int de�erine d�nd���nden ilk gelecek olan 5 oldugundan cevap 5tir. 
        
    }


 
}