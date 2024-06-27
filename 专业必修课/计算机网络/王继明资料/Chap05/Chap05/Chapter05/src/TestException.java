import java.util.*;
import java.util.Scanner;
public class TestException {
    private static Scanner scanner;
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	boolean inputsValid = false;
    	while(!inputsValid){
        	try{
        		System.out.println("请输入两个整数");
            	int a = in.nextInt( );   // 从键盘读取用户输入，并转换为整数
            	int b = in.nextInt( );
            	int result = a/b;
            	System.out.println("两数相除的结果是："+result);
        	}
        	catch(ArithmeticException ex)
        	{
        		System.out.println("The second number cannot be zero, please try again.");
        		in.nextLine();
        	}
    		catch(InputMismatchException ex)
    		{
    			System.out.println("Incorrect input, please try again.");
    			in.nextLine();
    		}
    	}
    }
}
