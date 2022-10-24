package Exercise7;

import java.io.*;
public class TryWithResource
{
	public static void main(String[] args)
	{
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mohammed SohailUddin\\eclipse-workspace\\HelloWorld\\src\\HelloWorld.java")))
		{
			String str;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}
		}
		catch(IOException ie)
		{  
			System.out.println("I/O Exception Caught is: "+ie);  
		}
		finally {
			System.out.println("No need to close stream explicitly by using try with resource");
		}
	}
}

//Output:
//
//public class HelloWorld {
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//	}
//}
//No need to close stream explicitly by using try with resource
