public class CatchWho2 { 
    public static void main(String[] args) { 
        try {
            try { 
                throw new ArrayIndexOutOfBoundsException(); 
            } 
            catch(ArithmeticException e) { 
                System.out.println( "ArrayIndexOutOfBoundsException" + "/�ڲ�try-catch"); 
            }
            throw new ArithmeticException(); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("����ArithmeticException"); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println( "ArrayIndexOutOfBoundsException" + "/���try-catch"); 
        } 
    } 
}