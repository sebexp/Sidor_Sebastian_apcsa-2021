package Unit_13;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = number % 10;
			number /= 10;
		}
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted.length - 1; j++) {
				int num;
				if (sorted[j] > sorted[j+1]) {
					num = sorted[j];
					sorted[j] = sorted[j+1];
					sorted[j+1] = num;
				}
			}
		}
		return sorted;
	}
}