package Unit_05;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords("lol", "pog");
		checkEquality();
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
		checkEquality();
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if(wordOne.compareTo(wordTwo) == 0) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if(checkEquality() == false) {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
		return wordOne + " has the same letters as " + wordTwo + "\n";
	}
}

/*
Compare two strings to see if each of the two strings contains the same letters in the same order.

hello goodbye
one two
three four
TCEA UIL
State Champions
ABC ABC
ABC CBA
Same Same

hello does not have the same letters as goodbye

one does not have the same letters as two

three does not have the same letters as four

TCEA does not have the same letters as UIL

State does not have the same letters as Champions

ABC has the same letters as ABC

ABC does not have the same letters as CBA

Same has the same letters as Same

 */