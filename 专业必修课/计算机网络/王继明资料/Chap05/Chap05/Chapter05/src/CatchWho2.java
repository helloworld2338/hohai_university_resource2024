public class CatchWho2 { 
    public static void main(String[] args) { 
        try {
            try { 
                throw new ArrayIndexOutOfBoundsException(); 
            } 
            catch(ArithmeticException e) { 
                System.out.println( "ArrayIndexOutOfBoundsException" + "/内层try-catch"); 
            }
            throw new ArithmeticException(); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("发生ArithmeticException"); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println( "ArrayIndexOutOfBoundsException" + "/外层try-catch"); 
        } 
    } 
}