package Unit_06;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("s", (char) 0);
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
		removeLetters();
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		while (cleaned.indexOf(lookFor) >= 0) {
			int location = cleaned.indexOf(lookFor);
			cleaned = cleaned.substring(0, location) + cleaned.substring(location+1);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}