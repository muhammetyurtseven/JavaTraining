class GasException extends Exception {}
class Element { 
    public int getSymbol() throws GasException { return -1; } // g1
    }
    public class Oxygen extends Element { 
        public int getSymbol() { return 8; } // g2 
        public void printData() { try {
            System.out.print(getSymbol()); } 
            catch { // g3 catch (Exception e) gibi bir deðiþken türü ve adý eksik olduðu için kod derlenmiyor.
            System.out.print("Unable to read data"); 
                
            }
            }}