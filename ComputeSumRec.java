public class ComputeSumRec {
  static int sum,rest;
  public static void ComputeSum(int number, int digits){
    System.out.println("GOT " + number + " and " + digits + " sum " + sum);
    if (digits==1) {
      sum = sum + number;
      System.out.println(sum);
    } else {
      rest = number % digits;
      number = number / digits;
      sum = sum + number;
      ComputeSum(rest,digits/10);
    }
  }
}
