public class Values {
integer a = Integer.valueOf("1"); //String tipini int tipine dönüştürmek
public static void main(String[] nums) 
    {
integer a = Integer.valueOf("2");
integer b = Integer.valueOf("3");
System.out.println(a + b); // iki tane a değişkeni oldugundan derlenmiyor.
    }
}