package Unit_02;//(c) A+ Computer Science
// www.apluscompsci.com
//Name -
//Date -

public class Cube
{
	public static double area( int side )
	{
		if (side != 0) {
			double cubeArea = 0;
			cubeArea = 6 * side * side;
			return cubeArea;
		}
		return 0;
	}
}