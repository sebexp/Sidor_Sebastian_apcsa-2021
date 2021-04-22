package Unit_12;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for name and size
		String name;
		int size;

		System.out.println("Enter 1st monster's name :: ");
		name = keyboard.next();

		out.println("Enter 1st monster's size :: ");
		size = keyboard.nextInt();

		//instantiate monster one
		Skeleton bones = new Skeleton(name, size);
		
		//ask for name and size
		out.println("Enter 2nd monster's name :: ");
		name = keyboard.next();

		out.println("Enter 2nd monster's size :: ");
		size = keyboard.nextInt();

		//instantiate monster two
		Skeleton bones1 = new Skeleton(name, size);

		if (bones.isSmaller(bones1)) out.println(bones.getName() + " is smaller than " + bones1.getName());
		if (bones.isBigger(bones1)) out.println(bones.getName() + " is bigger than " + bones1.getName());

		if (bones.namesTheSame(bones1)) out.println("They have the same name");
		else out.println("They do not have the same name.");
	}
}