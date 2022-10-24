package Exercise7;
public class PipesCatch
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3};
		try
		{
			for(int i=0;i<=arr.length;i++) {       
		    	System.out.println(arr[i]);     
		    }
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception Caught is: " + ae);
		}
	}
}

//Output:

//	1
//	2
//	3
//	Exception Caught is: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
