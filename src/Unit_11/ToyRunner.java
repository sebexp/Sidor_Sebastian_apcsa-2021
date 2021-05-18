package Unit_11;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner {
	public static void main(String[] args) {
		Toy t = new Toy("LAME");
		t.setCount(12);
		System.out.println(t);
		t.setName("not lame");
		t.setCount(999);
		System.out.println(t);
	}
}