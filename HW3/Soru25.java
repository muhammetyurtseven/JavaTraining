package mode;
public class Transportation { 
    public static String travel(int distance) { 
        return distance<1000 ? "train" : 10; // 3l� ifadelerde sa�daki ifadenin uyumlu olmas� laz�m ama burada birincisi string ikincisi int oldugundan derlenmez.
        } 
        public static void main(String[] answer) {
            System.out.print(travel(500)); 
            
        }

 
}