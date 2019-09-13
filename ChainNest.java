/*
 * 1) følg opskriften for at lave metoden
 * 2) skriv nogle linjer pseudokode som ca svarer til antal kodelinjer
 * 3) start der hvor du er mest tryg
 *
 *
 */


import java.util.*;
public class ChainNest {
  public static void main(String[] args) {
    String myResult = guess();
    System.out.println(myResult);
  }
  public static String guess() {
    // lav en random-generator
    // få et randomtal fra din randomgenerator
    // lav en scanner
    // få et gæt fra brugeren vha din scanner
    // hvis randomtal er lig brugerens gæt så
    // returnér "Du ramte"
    // hvis randomtal er mindre brugerens gæt så
    // returnér "Du ramte over"
    // ellers
    // returnér "Du ramte under"

    // random
    Random myRand = new Random();
    int randNumber = myRand.nextInt(9)+1;
    System.out.println(randNumber);
    Scanner myScan = new Scanner(System.in);
    System.out.println("Gæt på et tal mellem 1 og 9");
    int userGuess = myScan.nextInt();
    if (randNumber == userGuess) {
      return "Du ramte";
    } else  {
      if (randNumber < userGuess) {
        return "Du ramte over";
      } else {
        return "Du ramte under";
      }
    }
  }
}
