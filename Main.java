/*
 * 1) følg opskriften for at lave metoden
 * 2) skriv nogle linjer pseudokode som ca svarer til antal kodelinjer
 * 3) start der hvor du er mest tryg
 *
 *
 */

import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    boolean myTruth = guess(12);
    System.out.println(myTruth);
  }
  public static boolean guess(int tal) {
    // send et tal til gættemetoden
    // lav en random-generator
    // få et randomtal fra din randomgenerator
    // lav en scanner
    // få et gæt fra brugeren vha din scanner
    // hvis randomtal er lig brugerens gæt så
    // returnér sand
    // ellers 
    // returnér falsk

    // random
    Random myRand = new Random();
    int randNumber = myRand.nextInt(9)+1;
    System.out.println(randNumber);
    Scanner myScan = new Scanner(System.in);
    System.out.println("Gæt på et tal mellem 1 og 9");
    int userGuess = myScan.nextInt();
    if (randNumber == userGuess) {
      return true;
    } else {
      return false;
    }
  }
}
