package Unit_06;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() {
		setNums(0);
	}

	//add a set method
	public void setNums(int num) {
		number = num;
	}
	public boolean isPerfect()
	{
		int x = 1;
		int perfectNumber = 0;
		while (number > x) {
			if (number % x == 0) {
				perfectNumber = perfectNumber + x;
			}
			x++;
		}
		if (perfectNumber == number) {
			return true;
		}
		return false;
	}

	//add a toString	
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}
}