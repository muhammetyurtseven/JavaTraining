public class FirstName { 
    public static void main(String... names) { 
       
        String[][] listing = new String[][] { { "Book" }, { "Game", "29.99" } };
        System.out.println(listing.length + " " + listing[0].length); // �lk uzunlukta toplam dizinin uzunlu�u 2 olup ikincide sadece 0. indextekini sordugundan 1dir. Bu nedenle cevap 2 1 olacakt�r.
    }
    
}
