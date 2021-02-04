package Unit_05;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
		for(int i = 0; i < vowels.length; i++) {
			if(a.startsWith(vowels[i])) {
				return "yes";
			}
			else if(a.endsWith(vowels[i])) {
				return "yes";
			}
		}
		return "no";
	}
}
//if (a.substring(0) == "a" || a.substring(0) == "e" || a.substring(0) == "i" || a.substring(0) == "o" || a.substring(0) == "u" || a.substring(0) == "A" || a.substring(0) == "E" || a.substring(0) == "I" || a.substring(0) == "O" || a.substring(0) == "U" || a.substring(a.length()-1) == "a" || a.substring(a.length()-1) == "e" || a.substring(a.length()-1) == "i" || a.substring(a.length()-1) == "o" || a.substring(a.length()-1) == "u" || a.substring(a.length()-1) == "A" || a.substring(a.length()-1) == "E" || a.substring(a.length()-1) == "I" || a.substring(a.length()-1) == "O" || a.substring(a.length()-1) == "U") {
//			return "yes";
//		}
//		return "no";