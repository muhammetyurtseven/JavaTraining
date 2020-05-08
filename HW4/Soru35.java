public class EchoFirst { 
    public static void main(String[] args) { 
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        for (int i = 1; i <= days.length; i++) 
        System.out.println(days[i]); // son gelen deðer 7 oldugundan <=7 oldugundan olmasý gereken < operatör olmasý lazýmdýr. Bu nedenle ArrayIndexOutOfBoundsException atacaktýr.
        
    }
    
} 