public class HelloWorld{

     public static void main(String []args){
        int k = 0;
        for (int i = 10; i > 0; i--) 
        { while (i > 3) i -= 3; k += 1;}// ilk deðerde 10>3 de k=1 olur ve yeni i deðeri 7 dir. 7>3 tür ve gene burasý iþler. Sonra i=4 olur. En son i deðeri 1<3 oldugunda k=1 olur. Döngü dýþarý çýkar ve i=0 olur 0>0 olmadýgýndan ve k ekrana 1 olarak yazdýrýlýr.
        System.out.println(k);
     }
}