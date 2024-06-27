import java.io.*;
public class ThrowMultiExceptionsDemo { 
    public static void main(String[] args) 
    	{ 
      try { 
            throwsTest(); 
       } 
        catch(IOException e) { 
            System.out.println("Catch IOException"); 
        }
        catch(ArithmeticException ex){
        	System.out.println("Catch ArithmeticException");
        }
    }

    private static void throwsTest()  throws ArithmeticException,IOException { 
        System.out.println("��ֻ��һ������"); 
        // ��������̼��跢���쳣
//        throw new IOException(); 
        throw new ArithmeticException(); 
    } 
}