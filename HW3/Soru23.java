package transporter;
public class Rematerialize { 
    public static void main(String[] input) { 
        int dog = 11; 
        int cat = 3; 
        int partA = dog / cat; //burda 11/3 b�l�nd���nde 3 gelecektir.
        int partB = dog % cat; //burda 11/3 b�l�nd���nde kalan 4 gelecektir.
        int newDog = partB + partA * cat; // 4+ 3 * 3 sonu� olarak 11dir.
        System.out.print(newDog); 
        
    }
    
}
    