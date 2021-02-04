package Unit_02;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double slope = 0;
		double xslope = x2 - x1;
		double yslope = y2 - y1;
		slope = yslope / xslope;
		return slope;
	}

}