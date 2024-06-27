import java.util.Scanner;
public class TestException2 {
	public static void main(String[] args)
	{
		System.out.println("please input two integers.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if (b!=0)
		{
			if (!(input.hasNextInt())){
				int result = a/b;
				System.out.println("Two number division is: "+result);
			}
			else{
				System.out.println("Incorrect Inputs.");
			}
		}
		else{
			System.out.println("The division is zero.");
			System.out.println("The program is over.");
		}
	}
}
