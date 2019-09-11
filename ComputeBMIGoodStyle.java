import java.util.Scanner;
public class ComputeBMIGoodStyle {
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
    validateBMI();
    showResult();
  }

  static double computeBMI(double weight, double height) {
    double bmi = height/Math.pow(weight,2);
    return bmi;

  }
  static void validateBMI(){

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
