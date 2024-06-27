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
	//如果test方法声明抛出了比父类方法更大的异常,比如Exception
    //则代码将无法编译……
	public void test() throws FileNotFoundException
	{
            //...
	}
}