package peregrine;
        public class TimeLoop { 
            public static void main(String[] args) { 
                for (int i = args.length; i>=0; i--) 
                System.out.println(args[i]); // 3 gelece�inde bir kar��l��� olmad�g� i�in ArrayIndexOutOfBoundsException hatasu verir.
                
        
            }
            
        }