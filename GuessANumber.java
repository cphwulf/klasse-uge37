import java.util.Random;
import java.util.Scanner;
class GuessANumber {
  public static void main(String[] args) {
    /*
     * lad brugeren indtaste et tal
     * vurder om tallet er over eller under målet
     * giv feedback til brugeren
     * lad brugeren prøve 10 gange
     */

    String retMsg;
    int userG;
    userG = doDiag();
    int myRand = doRand();
    retMsg = doMath(userG, myRand);
    System.out.println(retMsg);
    userG = doDiag();
    retMsg = doMath(userG, myRand);
    System.out.println(retMsg);
    userG = doDiag();
    retMsg = doMath(userG, myRand);
    System.out.println(retMsg);
    userG = doDiag();
    retMsg = doMath(userG, myRand);
    System.out.println(retMsg);
    userG = doDiag();
    retMsg = doMath(userG, myRand);
    System.out.println(retMsg);
    userG = doDiag();
    retMsg = doMath(userG, myRand);
    System.out.println(retMsg);

  }
  public static int doRand() {
    int retVal;
    Random myRand = new Random();
    retVal = myRand.nextInt(99)+1;
    return retVal;
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
