package Unit_06;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover test = new LetterRemover();
		test.setRemover("Sentences are cool", 'e');
		out.println(test + "\n");

		test.setRemover("Did you know, E is the most common letter that gets typed. Does that mean it's just common in daily application, or it is the most common letter in the alphabet?", 'e');
		out.println(test + "\n");

		test.setRemover("Doing another letter so you can tell not only just e works.", 's');
		out.println(test + "\n");
	}
}