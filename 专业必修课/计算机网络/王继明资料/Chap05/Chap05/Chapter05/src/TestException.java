import java.util.*;
import java.util.Scanner;
public class TestException {
    private static Scanner scanner;
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	boolean inputsValid = false;
    	while(!inputsValid){
        	try{
        		System.out.println("��������������");
            	int a = in.nextInt( );   // �Ӽ��̶�ȡ�û����룬��ת��Ϊ����
            	int b = in.nextInt( );
            	int result = a/b;
            	System.out.println("��������Ľ���ǣ�"+result);
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
