package InnerClass;

/**
 * Created by svetlana on 27.09.16
 */
public class Runner {
    public static void main(String[] args) {
        TennisMatch matchOne = new TennisMatch();
        matchOne.printMatchResult("A", "B", 3, 2, "J");

        TennisMatch matchTwo = new TennisMatch();
        matchTwo.printMatchResult("A", "B", 2, 3, "J");

        TennisMatch matchTree= new TennisMatch();
        matchTree.printMatchResult("A", "B", 2, 2, "J");

    }
}
