package Unit_01;//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes {
    public StarsAndStripes() {
        out.println("\nStarsAndStripes");
        printTwoBlankLines();
    }

    public void printTwentyStars() {
        out.println("********************");
    }

    public void printTwentyDashes() {
        out.println("--------------------");
    }

    public void printTwoBlankLines() {
        out.println("\n\n");
    }

    public void printASmallBox() {
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }

    public void printABigBox() {
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }
}