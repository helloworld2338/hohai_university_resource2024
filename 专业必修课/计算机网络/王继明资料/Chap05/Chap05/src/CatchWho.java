public class CatchWho { 
    public static void main(String[] args) { 
        try { 
            try { 
                throw new ArrayIndexOutOfBoundsException(); 
            } 
            catch(ArrayIndexOutOfBoundsException e) { 
               System.out.println("ArrayIndexOutOfBoundsException" + "/ÄÚ²ãtry-catch"); 
            }
            throw new ArithmeticException(); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("ArithmeticException is ocurred."); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
           System.out.println("ArrayIndexOutOfBoundsException" + "/Íâ²ãtry-catch"); 
        } 
    } 
}