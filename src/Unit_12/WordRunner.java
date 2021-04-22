package Unit_12;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\sidor\\IdeaProjects\\Sidor_Sebastian_apcsa-2021\\src\\Unit_12\\words.dat"));

		int size = file.nextInt();
		file.nextLine();
		ArrayList<Word> words = new ArrayList<>();
		for (int i = 0; i < size; i++)
		{
			Word w = new Word(file.nextLine());
			words.add(w);
		}
		for (int i = 0; i < size; i++) {
			Word lowest = words.get(0);
			for (int j = 0; j < words.size(); j++) {
				if (lowest.compareTo(words.get(j)) > 0) lowest = words.get(j);
			}
			words.remove(words.indexOf(lowest));
			System.out.println(lowest);
		}
	}
}