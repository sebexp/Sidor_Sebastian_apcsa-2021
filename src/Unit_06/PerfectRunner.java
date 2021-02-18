package Unit_06;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect();
		test.setNums(6);
		out.println(test + "\n");

		test.setNums(45);
		out.println(test + "\n");

		test.setNums(14);
		out.println(test + "\n");

		test.setNums(8128);
		out.println(test + "\n");

		test.setNums(12345);
		out.println(test + "\n");

		test.setNums(33);
		out.println(test + "\n");

		test.setNums(28);
		out.println(test + "\n");

		test.setNums(27);
		out.println(test + "\n");

		test.setNums(33550336);
		out.println(test + "\n");
	}
}