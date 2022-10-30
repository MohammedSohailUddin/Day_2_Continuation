package Exercise7;
import java.util.Scanner;
public class MultiCatchSeparateBlocks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a number:");
			int n = sc.nextInt();
			if(n%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
			//division by zero exception for input 0
			n=0/n;
			sc.close();
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Exception Caught is: " + ae);
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception Caught is: " + ae);
		}
		catch (Exception ae)
		{
			System.out.println("Exception Caught is: " + ae);
		}
	}
}

//Output:

//	Enter a number:
//		7
//		Odd
//
//	Enter a number:
//		0
//		Even
//		Exception Caught is: java.lang.ArithmeticException: / by zero

