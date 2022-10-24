package Exercise6;

import java.util.Scanner;
	public class SquareRoot {
		   public static void main(String[] args) {
		       try {
			   int num1, num2;
			   double square;
		       Scanner sc = new Scanner(System.in);
		       System.out.println("Enter a number to calculate square root:");
		       num1 = sc.nextInt();
		       square = Math.sqrt(num1);
		       System.out.println("Square of "+num1+" is: " + square);
		       System.out.println();
		       
		       //checking division by zero exception
		       System.out.println("Enter a number to check for divisionbyzero exception:");
		       num2 = sc.nextInt();
		       square = num2/0;
		       sc.close();
		       }
		       catch(ArithmeticException ae) {
		    	   System.out.println("Caught Exception is: "+ ae);
		       }
		   	}
	}

//Output:
//	Enter a number to calculate square root:
//		4
//		Square of 4 is: 2.0
//		Enter a number to check for division by zero exception:
//		5
//		Caught Exception is: java.lang.ArithmeticException: / by zero
