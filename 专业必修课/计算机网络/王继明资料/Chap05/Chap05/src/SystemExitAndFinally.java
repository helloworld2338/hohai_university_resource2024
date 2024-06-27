public class SystemExitAndFinally {
    public static void main(String[] args)
    {
        try{
            System.out.println("in main");
            throw new Exception("Exception is thrown in main");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        finally
        {
            System.out.println("in finally");
        }
    }
}
