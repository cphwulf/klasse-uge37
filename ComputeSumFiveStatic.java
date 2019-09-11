public class ComputeSumFiveStatic {
  public static int CS(int number){
    int titusinder = number / 10000;
    int rest = number % 10000;
    int tusinder = rest / 1000;
    rest = rest % 1000;
    int hundreder = rest / 100;
    rest = rest % 100;
    int tiere = rest / 10;
    rest = tiere % 100;
    int sum = titusinder + tusinder + hundreder + tiere + rest;
    return sum;
  }
}
