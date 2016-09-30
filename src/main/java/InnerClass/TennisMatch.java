package InnerClass;

/**
 * Created by svetlana on 26.09.16
 * <p/>
 * Create a class TennisMatch which will have inner classes Judge and Player,
 * Judge will hold his name
 * Player will hold his name and score.
 * <p/>
 * Each TennisMatch will consist of one Judge and 2 players and the ability to get values, set values & print match result.
 * <p/>
 * Write a program that will create a TennisMatch and will print who is the winner,
 * Note! if the score of the two players is equal it should print "It's a Tie!"
 */
public class TennisMatch {

    private String judge;
    Judge judgeName = new Judge(judge);
    private String playerNameTwo;

    Player playerTwo = new Player(playerNameTwo);
    private String playerNameOne;

    Player playerOne = new Player(playerNameOne);
    private int score;

    public void printMatchResult(String playerNameOne, String playerNameTwo, int scoreOne, int scoreTwo, String judge) {
        playerOne.setPlayerName(playerNameOne);
        playerTwo.setPlayerName(playerNameTwo);
        judgeName.setJudgeName(judge);

        playerOne.setScore(scoreOne);
        playerTwo.setScore(scoreTwo);

        if (playerOne.getScore() > playerTwo.getScore()) {

            System.out.println(playerNameOne + " Won! " + playerOne.getScore() + " Judge was " + judge);
        } else if (playerOne.getScore() == playerTwo.getScore()) {
            System.out.println("It's a Tie!" + " Judge was " + judge);
        } else {
            System.out.println(playerNameTwo + " Won! " + playerTwo.getScore() + " Judge was " + judge);
        }
    }

    public class Judge {
        String judgeName;

        public Judge(String judgeName) {
            this.judgeName = judgeName;
        }

        public void setJudgeName(String judgeName) {
            this.judgeName = judgeName;
        }

    }

    public class Player {
        String playerName;
        int score;

        public Player(String playerName) {
            this.playerName = playerName;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

    }
}
