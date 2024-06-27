/**
 * �Զ�����쳣��
 * @author 
 *
 */
class MyException extends Exception
{
    public MyException(String Message) {
        super(Message);
    }
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
     public MyException( Throwable cause) {
        super(cause);
    }

}

public class ExceptionLinkInRealWorld {
   public static void main( String args[] )
   {
      try {
         throwExceptionMethod();  //�п����׳��쳣�ķ�������
      }
      catch ( MyException e )
      {
         System.err.println( e.getMessage() );
         System.err.println(e.getCause().getMessage());
      }
      catch ( Exception e )
      {
         System.err.println( "Exception handled in main" );
      }
      doesNotThrowException(); //���׳��쳣�ķ�������
   }

   public static void throwExceptionMethod() throws MyException
   {
      
      try {
         System.out.println( "Method throwException" );

         throw new Exception("ϵͳ����ʱ�������ض����쳣");  // ������һ���ض����쳣
      }
      catch( Exception e )
      {
         System.err.println(
            "Exception handled in method throwException" );
         //ת��Ϊһ���Զ����쳣�����׳�
         throw new MyException("�ڷ���ִ��ʱ�����쳣",e);

         
      }
      finally {
         System.err.println(
            "Finally executed in throwException" );
      }

      // any code here would not be reached
   }

   public static void doesNotThrowException()
   {
      try {
         System.out.println( "Method doesNotThrowException" );
      }
      catch( Exception e )
      {
         System.err.println( e.toString() );
      }
      finally {
         System.err.println(
            "Finally executed in doesNotThrowException" );
      }

      System.out.println(
         "End of method doesNotThrowException" );
   }
}

