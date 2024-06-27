import javax.swing.*;

public class AboutException {
   public static void main(String[] a) 
   {
      int i=1, j=0, k;
//     k=i/j;

	try
	{
		
		k = i/j;    // Causes division-by-zero exception
		//throw new Exception("Hello.Exception!");
	}
	
	catch ( ArithmeticException e)
	{
		System.out.println("±»0³ý.  "+ e.getMessage());
	}
	
	catch (Exception e)
	{
		if (e instanceof ArithmeticException)
			System.out.println("±»0³ý");
		else
		{  
			System.out.println(e.getMessage());
			
		}
	}
	
	finally
     {
     		JOptionPane.showConfirmDialog(null,"OK");    }
		
  }
}