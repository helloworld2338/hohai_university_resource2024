import java.io.*; 
 
public class CheckedExceptionDemo { 
    public static void main(String[] args)  { 
        try { 
            BufferedReader buf = new BufferedReader( 
                new InputStreamReader(System.in));    //�׳��ܿص��쳣
            System.out.print("����������: "); 
            int input = Integer.parseInt(buf.readLine()); //�п�����������ʱ�쳣
            System.out.println("input x 10 = " + (input*10)); 
      } 
        //�����쳣���������Ǳ���ģ������޷�ͨ������
        catch(IOException e) { 
            System.out.println("I/O����"); 
        } 
        //�����쳣�����������ʡ�ԣ���Ӱ����룬��������ʱ����
        catch(NumberFormatException e) { 
            System.out.println("�������Ϊ����"); 
        }
    } 
}