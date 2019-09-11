import java.util.Random;
import java.util.Scanner;
class YatzyTwo {
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


    //String playerOne = doIntro();
    //String playerTwo = doIntro();
    int playerOneRoll = rollDice(5);
    //retVal 55451
    // behold 1,2 og 4, altså 555
    playerOneRoll = 55451;
    int keeperVal = 111010;
    int playerOneKeepVals = keepVal(playerOneRoll+100000,keeperVal);

    int playerTwoRoll = rollDice(5);
    System.out.println(playerOneRoll);

    System.out.println(playerTwoRoll);
    playerOneRoll = rollDice(3);
    playerTwoRoll = rollDice(3);
    System.out.println(playerOneRoll);
    System.out.println(playerTwoRoll);
  }
  public static int keepVal(int diceVals, int keepers) {
    //  kommer 155451 og 111010
    //
    //  returner 155050
    int retVal = 10000;
    int d1=0;
    int d2=0;
    int d3=0;
    int d4=0;
    int d5=0;
    System.out.println("DVal:" + diceVals + "  kEE " + keepers);
    if (keepers%10 == 1) {
      d1=diceVals%10;
    }
    diceVals = diceVals / 10;
    keepers = keepers / 10;
    if (keepers%10 == 1) {
      d2=diceVals%10;
    }
    diceVals = diceVals / 10;
    keepers = keepers / 10;
    if (keepers%10 == 1) {
      d3=diceVals%10;
    }
    diceVals = diceVals / 10;
    keepers = keepers / 10;
    if (keepers%10 == 1) {
      d4=diceVals%10;
    }
    diceVals = diceVals / 10;
    keepers = keepers / 10;
    if (keepers%10 == 1) {
      d5=diceVals%10;
    }
    System.out.println("--");
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
    System.out.println(d5);
    System.out.println("--");
    return 55050;
  }

  public static int rollDice(int numOfDices) {
    int retVal = 100000;
    int diceOne = 0;
    int diceTwo = 0;
    int diceThree = 0;
    int diceFour = 0;
    int diceFive = 0;
    Random myRand = new Random();
    if (numOfDices > 0)  {
      numOfDices = numOfDices - 1;
      diceOne = myRand.nextInt(5)+1;
    }
    if (numOfDices > 0)  {
      numOfDices = numOfDices - 1;
      diceTwo = myRand.nextInt(5)+1;
    }
    if (numOfDices > 0)  {
      numOfDices = numOfDices - 1;
      diceThree = myRand.nextInt(5)+1;
    }
    if (numOfDices > 0)  {
      numOfDices = numOfDices - 1;
      diceFour = myRand.nextInt(5)+1;
    }
    if (numOfDices > 0)  {
      numOfDices = numOfDices - 1;
      diceFive = myRand.nextInt(5)+1;
    }
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
