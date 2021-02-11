package Unit_05_Magpie_Activities;

/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		String sample2 = "Computer science is the best, the greatest, and the most wonderful subject to study.";
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);

		int pos = sample.indexOf("slow");
		if(pos != -1)
			System.out.println("slow is found at position " + pos);
		else
			System.out.println("slow is not found");

		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		for (int i = 0; i < sample2.length(); i++) {
			if (i == 0) {
				System.out.println(sample2.indexOf("the", i));
			} else if (i > 0) {
				if (sample2.indexOf("the", i - 0) != sample2.indexOf("the", i - 1)) {
					System.out.println(sample2.indexOf("the", i));
				}
			}
		}
	}
}
