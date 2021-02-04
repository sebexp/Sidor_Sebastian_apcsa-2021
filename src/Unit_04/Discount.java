package Unit_04;//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	private static double finalBill = 0;
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public void getDiscountedBill(double bill)
	{
		if(bill > 2000) {
			finalBill = bill * 0.85;
		};
	}
	public void print() {
		System.out.println(toString());
	}
	public String toString() {
		return "Bill after discount :: " + finalBill;
	}
}