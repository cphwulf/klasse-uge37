import java.util.Random;
import java.util.Scanner;
class YatzyOne {
  public static void main(String[] args) {
    /*
     * tre slag hver med 5 terninger
     * man skal kunne tage terninger fra
     * efter tre slag sammenlignes de fem terninger
     *
     * 1 par
     * 2 par
     * 3 ens
     * 4 ens
     * 5 ens
     * lille straight
     * stor straight
     * fuldt hus
     * chance
     *
     *
     * Første iteration:
     * et slag med 5 terninger
     *
     */

    String playerOne = doIntro();
    String playerTwo = doIntro();
    int playerOneRoll = rollDice(5);
    int playerTwoRoll = rollDice(5);
    System.out.println(playerOneRoll);
    System.out.println(playerTwoRoll);

    //int sumPlayer1 = doSum(playerOneRoll);
    //int sumPlayer2 = doSum(playerTwo);
  }
  public static int doSum(int diceRoll) {

  }

  public static int rollDice(int numOfDices) {
    int retVal = 100000;
    Random myRand = new Random();
    int diceOne = myRand.nextInt(5)+1;
    int diceTwo = myRand.nextInt(5)+1;
    int diceThree = myRand.nextInt(5)+1;
    int diceFour = myRand.nextInt(5)+1;
    int diceFive = myRand.nextInt(5)+1;
    retVal = diceOne * 10000;
    retVal = retVal + diceTwo * 1000;
    retVal = retVal + diceThree * 100;
    retVal = retVal + diceFour * 10;
    retVal = retVal + diceFive; 
    return retVal;
  }
  public static String doIntro() {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Hvem er du?");
    String userName = myScan.nextLine();
    return userName;
  }
}
