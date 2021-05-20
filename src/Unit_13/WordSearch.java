package Unit_13;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int count = 0;
    	m = new String[size][size];
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			m[i][j] = "" + str.charAt(count);
    			count++;
			}
		}
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i < m.length-1;i++) {
    		if (checkRight(word,i,i)||checkLeft(word,i,i)||checkUp(word,i,i)||checkDown(word,i,i)||checkDiagUpRight(word,i,i)||checkDiagUpLeft(word,i,i)||checkDiagDownRight(word,i,i)||checkDiagDownLeft(word,i,i)) return true;
		}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   	{
   		String s = "";
   		for (int i = 0; i < m.length; i++) s+= m[r][i];
   		if (s.indexOf(w) > -1) return true;
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String s = "";
		for (int i = m.length - 1; i > -1; i--) s+= m[r][i];
		if (s.indexOf(w) > -1) return true;
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String s = "";
		for (int i = m.length - 1; i > -1; i--) s+= m[i][c];
		if (s.indexOf(w) > -1) return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   String s = "";
	   for (int i = 0; i < m.length; i++) s+= m[i][c];
	   if (s.indexOf(w) > -1) return true;
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String s = "";
		int r2 = r;
		for (int i = 0; i <= r; i++) {
			s += m[r2][i];
			r2--;
		}
		if (s.indexOf(w) > -1) return true;
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String s = "";
		int r2 = r;
		int c2 = m.length-1;
		for (int i = 0; i <= r; i++) {
			s += m[r2][c2];
			r2--;
			c2--;
		}
		if (s.indexOf(w) > -1) return true;
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   	{
   		String s = "";
   		int r2 = 0;
   		int c2 = c;
   		for (int i = 0; i <= c; i++) {
   			s += m[r2][c2];
   			r2++;
   			c2--;
		}
   		if (s.indexOf(w) > -1) return true;
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String s = "";
		int r2 = 0;
		int c2 = c;
		for (int i = 0; i <= m.length - c -1; i++) {
			s += m[r2][c2];
			r2++;
			c2++;
		}
		if (s.indexOf(w) > -1) return true;
		return false;
	}

    public String toString()
    {
 		String s = "";
 		for (int i = 0; i < m.length; i++) {
 			for (int j = 0; j < m.length; j++) {
 				s += m[i][j] + " ";
			}
 			s += "\n";
		}
 		return s;
    }
}
