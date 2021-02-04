package Unit_05;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		setString("sub");
		isEven("sub");
	}

	public StringOddOrEven(String s)
	{
		setString(s);
		isEven(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public String isEven(String s)
 	{
		if(word.length() % 2 == 0) {
			return "even";
		}
		return "odd";
	}

 	public String toString()
 	{
 		String output = word + " is " + isEven(word) + ".";
 		return output;
	}
}

/*
Enter a word :: cat
cat is odd.

Enter a word :: boot
boot is even.

Enter a word :: it
it is even.

Enter a word :: a
a is odd.

Enter a word :: eleven
eleven is even.

Enter a word :: thirteen
thirteen is even.

Enter a word :: odd
odd is odd.

Enter a word :: even
even is even.
 */