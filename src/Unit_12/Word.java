package Unit_12;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		if (word.equals(rhs.word)) return 1;
		if (word.length() > rhs.word.length()) return 1;
		if (word.length() < rhs.word.length()) return -1;
		if (word.length() == rhs.word.length()) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) > rhs.word.charAt(i)) return 1;
				else if(word.charAt(i) < rhs.word.charAt(i)) return -1;
			}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}