import java.util.Random;
import java.util.Scanner;
class GuessANumberTwo {
    static String retMsg;
    final static String RETVAL = "OK";
  public static void main(String[] args) {
    /*
     * lad brugeren indtaste et tal
     * vurder om tallet er over eller under målet
     * giv feedback til brugeren
     * lad brugeren prøve 10 gange
     * overlad kontrollen til en controllermetode
     */

    int userG;
    // init run
    userG = doDiag();
    int myRand = doRand();
    retMsg = doMath(userG, myRand);
    System.out.println(retMsg);
    if (retMsg != RETVAL) {
      doRun(myRand);
    } else {
      System.out.println("du vandt");
    }
  }

  public static void doRun(int myRand) {
    int userG;
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
      retMsg = RETVAL;
    }
    return retMsg;
  }
}
