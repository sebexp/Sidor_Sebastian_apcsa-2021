package Unit_13;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for (int i = 0; i < wordRay.length; i++) {
			for (int j = 0; j < wordRay.length - 1; j++) {
				String word = "";
				for (int k = 0; k < wordRay[j].length(); k++) {
					if (wordRay[j].charAt(k) > wordRay[j + 1].charAt(k)) {
						word = wordRay[j];
						wordRay[j] = wordRay[j+1];
						wordRay[j+1] = word;
						k = wordRay[j].length();
					}
					else if (wordRay[j].charAt(k) < wordRay[j + 1].charAt(k)) {
						k = wordRay[j].length();
					}
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}