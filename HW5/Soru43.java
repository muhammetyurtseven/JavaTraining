import java.util.*;
public class Exams { 
    public static void main(String[] args) { 
        List<String> exams = Arrays.asList("OCA", "OCP"); 
        for (String e1 : exams) 
        for (String e2 : exams) 
        System.out.println(e1 + " " + e2); //burada her d�ng� iki kere i�lenece�inden sonu� 4 kere ekrana ��kacakt�r
        
    }
    
}