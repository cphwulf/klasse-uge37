import java.util.Scanner;
public class ComputeBMIGoodStyleValidation {
  public static void main(String[] args){
    /*
     * Progammet skal kunne indlæse navn, alder, vægt og højde
     * Det skal udskrive flg.:
     * Kære NN. Din BMI er <bmi> og du er <moodindicator> <bmigrad>
     * Indlæs brugerens vægt
     * Indlæs brugerens højde
     * udregn BMI
     * Sammensæt vurdering ud fra bmi
     *
     * BMI < 18.5 undervægt - lav risiko for fedmerelaterede komplikationer
     * BMI 18.5-24.9 er normal vægt - middel risiko for fedmerelaterede komplikationer
     * BMI 25-29.9 overvægt - let øget risiko for fedmerelaterede komplikationer
     * BMI > 30 - 39.9 svær overvægt moderat til høj  øget risiko for fedmerelaterede komplikationer
     * BMI > 40 ekstrem overvægt - meget høj risiko for fedmerelaterede komplikationer
     *
     *
     */

    double weight = getInput("vægt", "kg");
    double height = getInput("højde", "m");
    int age = (int)getInput("alder", "år");
    double bmi = computeBMI(weight,height);
    String validation = validateBMI(bmi);
    showResult();
  }

  static double computeBMI(double weight, double height) {
    double bmi = weight/Math.pow(height,2);
    return bmi;

  }
  static String validateBMI(double bmi){
    /*
     * BMI < 18.5 undervægt - lav risiko for fedmerelaterede komplikationer
     * BMI 18.5-24.9 er normal vægt - middel risiko for fedmerelaterede komplikationer
     * BMI 25-29.9 overvægt - let øget risiko for fedmerelaterede komplikationer
     * BMI > 30 - 39.9 svær overvægt moderat til høj  øget risiko for fedmerelaterede komplikationer
     * BMI > 40 ekstrem overvægt - meget høj risiko for fedmerelaterede komplikationer
     */
    System.out.println("MBM: " + bmi);
    if (bmi > 40) {
      System.out.println("ekstrem");
    } else if (bmi > 30) {
      System.out.println("svær");
    } else if (bmi > 25) {
      System.out.println("overvægt");
    } else if (bmi > 18.5) {
      System.out.println("normal");
    } else {
      System.out.println("undervægt");
    } 
    return "ok";
  }
  static void showResult(){

  }
  static double getInput(String msg, String unit){
    System.out.println("Indtast din  " + msg + " i " + unit);
    Scanner myScan = new Scanner(System.in);
    double inputVal =  myScan.nextDouble();
    return inputVal;
  }

}
