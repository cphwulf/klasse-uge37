public class ComputeSum {
  public static int ComputeSum(int number){
    int hundreder = number / 100;
    int rest = number % 100;
    int tiere = rest / 10;
    rest = tiere % 100;
    int sum = hundreder + tiere + rest;
    return sum;
  }
}
