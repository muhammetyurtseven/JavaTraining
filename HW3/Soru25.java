package mode;
public class Transportation { 
    public static String travel(int distance) { 
        return distance<1000 ? "train" : 10; // 3lü ifadelerde saðdaki ifadenin uyumlu olmasý lazým ama burada birincisi string ikincisi int oldugundan derlenmez.
        } 
        public static void main(String[] answer) {
            System.out.print(travel(500)); 
            
        }

 
}