package voting;
public class Election {
    public void calculateResult(Integer candidateA, Integer candidateB) {
        boolean process = candidateA == null || candidateA.intValue() < 10; //boolean bir ifade oldugu için yalnýzca true veya false deðerlerini alabildiðinden bu satýr derlenmez.
        boolean value = candidateA && candidateB;
        System.out.print(process || value);
        }
        public static void main(String[] unused) {
            new Election().calculateResult(null,203);
            }
            }