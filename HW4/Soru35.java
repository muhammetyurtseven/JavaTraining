public class EchoFirst { 
    public static void main(String[] args) { 
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        for (int i = 1; i <= days.length; i++) 
        System.out.println(days[i]); // son gelen de�er 7 oldugundan <=7 oldugundan olmas� gereken < operat�r olmas� laz�md�r. Bu nedenle ArrayIndexOutOfBoundsException atacakt�r.
        
    }
    
} 