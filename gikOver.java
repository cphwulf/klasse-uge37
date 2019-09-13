import java.util.Scanner;

public class gikOver {
    public static void main(String[] args) {

      String Land="Trampeland";
      String Aktivitet="trampe";

      String startOfSong = indtilDetGivneLand();

      String mySongLine4= versDel1(Land);
      String mySongLine5= versDel2(Aktivitet);
      String mySongLine6= versDel3(Land);
      String mySong = startOfSong + mySongLine4 + mySongLine5 + mySongLine6;
      System.out.print(mySong);

      Land = ditEgetLand("Land");
      Aktivitet = ditEgetLand("Aktivitet");

      mySongLine4= versDel1(Land);
      mySongLine5= versDel2(Aktivitet);
      mySongLine6= versDel3(Land);
      mySong = startOfSong + mySongLine4 + mySongLine5 + mySongLine6;
      System.out.print(mySong);
    }
    public static String indtilDetGivneLand() {
      String myString = "Jeg gik mig over soe og land,\n";
      myString = myString + "Der moedte jeg en gammel mand.\n";
      myString = myString + "Han sa'e saa og spurgte saa:\n";
      myString = myString + "\"Og hvor har du vel hjemme?\"\n";
      return myString;
    }
    
    public static String versDel1(String land) {
      String myString = "\"Jeg har hjemme i " + land + ",\n ";
      myString = myString + land + ", " + land + ",\n ";
      return myString;
    }
    
    public static String versDel2(String landKan) {
      String myString = "og alle de som " + landKan + " kan,\n";
      return myString;
    }
    
    public static String versDel3(String land) {
      String myString = "de har hjemme i " + land + "\".\n";
      return myString;
    }
    public static String ditEgetLand(String typeOfQuestion) {
        Scanner input = new Scanner(System.in);
        String ditValg;
        System.out.println("Hvad hedder dit " + typeOfQuestion);
        ditValg = input.nextLine();
        return ditValg;
    }
}
