public class HelloWorld{

     public static void main(String []args){
        int k = 0;
        for (int i = 10; i > 0; i--) 
        { while (i > 3) i -= 3; k += 1;}// ilk de�erde 10>3 de k=1 olur ve yeni i de�eri 7 dir. 7>3 t�r ve gene buras� i�ler. Sonra i=4 olur. En son i de�eri 1<3 oldugunda k=1 olur. D�ng� d��ar� ��kar ve i=0 olur 0>0 olmad�g�ndan ve k ekrana 1 olarak yazd�r�l�r.
        System.out.println(k);
     }
}