package Unit_05;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
		setWords("lol", "pog3");
		compare();
	}

	public WordsCompare(String one, String two)
	{
		setWords(one, two);
		compare();
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}
/*
Compare two Strings to determine if the first word should be placed before or after the second word in the dictionary.

abe ape
giraffe gorilla
one two
fun funny
123 19
193 1910
goofy godfather
funnel fun

abe should be placed before ape

giraffe should be placed before gorilla

one should be placed before two

fun should be placed before funny

123 should be placed before 19

193 should be placed after 1910

goofy should be placed after godfather

funnel should be placed after fun
 */