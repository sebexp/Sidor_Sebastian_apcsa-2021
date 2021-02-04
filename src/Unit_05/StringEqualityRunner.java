package Unit_05;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter word one :: ");
		String one = keyboard.nextLine();

		out.print("Enter word two :: ");
		String two = keyboard.nextLine();

		StringEquality test = new StringEquality();
		test.setWords(one, two);
		test.checkEquality();
		out.print(test.toString());
	}
}