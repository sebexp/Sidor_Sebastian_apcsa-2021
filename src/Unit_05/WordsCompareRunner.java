package Unit_05;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
       Scanner keyboard = new Scanner(in);

       out.print("Enter word one :: ");
       String one = keyboard.nextLine();

       out.print("Enter word two :: ");
       String two = keyboard.nextLine();

       WordsCompare test = new WordsCompare();
       test.setWords(one, two);
       test.compare();
       out.print(test.toString());
	}
}