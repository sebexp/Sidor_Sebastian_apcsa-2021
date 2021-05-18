package Unit_11;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy {
	private String name;
	private int count;

	public Toy() {
		this.name = "";
		this.count = 0;
	}

	public Toy(final String nm) {
		this.name = nm;
		this.setCount((int) (Math.random() * 1000));
	}

	public Toy(final String s, final int c) {
		this.name = s;
		this.count = c;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(final int cnt) {
		this.count = cnt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String nm) {
		this.name = nm;
	}

	public String toString() {
		return this.name + " " + this.count;
	}
}