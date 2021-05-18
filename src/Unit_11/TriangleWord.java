package Unit_11;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 0; i < word.length() + 1; i++) {
			String chars = word.substring(0, i);
			String phrase = "";

			for (int j = 0; j < chars.length(); j++) {
				phrase = phrase + chars;
			}
			out.println(phrase);
		}
	}
}