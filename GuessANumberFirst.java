import java.util.Random;
import java.util.Scanner;
class GuessANumberFirst {
  public static void main(String[] args) {
    /*
     * lad brugeren indtaste et tal
     * vurder om tallet er over eller under målet
     * giv feedback til brugeren
     */
    int userGuess = doDiag();
    int randVal = doRand();
    System.out.println("RAND" + randVal);
    String retString = doMath(userGuess, randVal);
    System.out.println(retString);

  }
  public static int doRand() {
    Random myRand = new Random();
    return myRand.nextInt(99)+1;
  }

  public static int doDiag() {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast tal mellem 1 og 100:");
    int userGuess = myScan.nextInt();
    return userGuess;
  }
  public static String doMath(int userGuess, int randNum) {
    String retMsg;
    if (userGuess > randNum) {
      retMsg = "too High";
    } else if (userGuess < randNum) {
      retMsg = "too Low";
    } else {
      retMsg = "true";
    }
    return retMsg;
  }
}
