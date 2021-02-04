package Unit_04;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();

		out.print(num + " is even :: " + NumberVerify.isEven(num) + "\n");

		out.print(num + " is odd :: " + NumberVerify.isOdd(num) + "\n");

	}
}