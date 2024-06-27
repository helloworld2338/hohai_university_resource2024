// UsingExceptions.java
// Demonstrating the getMessage and printStackTrace
// methods inherited into all exception classes.
public class PrintExceptionStack {
   public static void main( String args[] )
   {
      try {
         method1();
      }
      catch ( Exception e ) {
         System.err.println( e.getMessage() + "\n" );
         e.printStackTrace();
      }
   }

   public static void method1() throws Exception
   {
      method2();
   }

   public static void method2() throws Exception
   {
      method3();
   }

   public static void method3() throws Exception
   {
      throw new Exception( "Exception thrown in method3" );
   }
}

