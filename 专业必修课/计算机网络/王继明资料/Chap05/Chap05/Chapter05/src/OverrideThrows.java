import java.io.*;

public class OverrideThrows
{
	public void test()throws IOException
	{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
class Sub extends OverrideThrows
{
	//���test���������׳��˱ȸ��෽��������쳣,����Exception
    //����뽫�޷����롭��
	public void test() throws FileNotFoundException
	{
            //...
	}
}