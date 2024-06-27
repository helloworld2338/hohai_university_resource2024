public class ThrowDemo { 
    public static void main(String[] args) { 
        try {
            double data = 100 / 0.0;
            System.out.println("浮点数除以零：" + data); 
            if(String.valueOf(data).equals("Infinity"))
            { 
            	System.out.println("In Here" ); 
                throw new ArithmeticException("除零异常");
            }
        } 
        catch(ArithmeticException e) { 
            System.out.println(e); 
        } 
    } 
}
 