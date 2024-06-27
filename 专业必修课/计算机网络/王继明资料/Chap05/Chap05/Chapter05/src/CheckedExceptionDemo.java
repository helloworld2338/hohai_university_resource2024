import java.io.*; 
 
public class CheckedExceptionDemo { 
    public static void main(String[] args)  { 
        try { 
            BufferedReader buf = new BufferedReader( 
                new InputStreamReader(System.in));    //抛出受控的异常
            System.out.print("请输入整数: "); 
            int input = Integer.parseInt(buf.readLine()); //有可能引发运行时异常
            System.out.println("input x 10 = " + (input*10)); 
      } 
        //以下异常处理语句块是必须的，否则无法通过编译
        catch(IOException e) { 
            System.out.println("I/O错误"); 
        } 
        //以下异常处理语句块可以省略，不影响编译，但在运行时出错
        catch(NumberFormatException e) { 
            System.out.println("输入必须为整数"); 
        }
    } 
}