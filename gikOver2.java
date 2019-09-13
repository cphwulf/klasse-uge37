import java.util.Scanner;

public class gikOver2 {
  public static void main(String[] args) {

    String songTemplate = "Jeg gik mig over soe og land,\n Der moedte jeg en gammel mand.\n Han sa'e saa og spurgte saa:\nOg hvor har du vel hjemme?\n Jeg har hjemme i landholder, landholder, landholder\n, og alle de som landaktivitet kan,\nde har hjemme i landholder\n";

    String Land="Trampeland";
    String Aktivitet="trampe";

    String mySong = songComposer(songTemplate, Land,Aktivitet);
    System.out.print(mySong);

    Land = ditEgetLand("Land");
    Aktivitet = ditEgetLand("Aktivitet");

    mySong = songComposer(songTemplate, Land,Aktivitet);
    System.out.print(mySong);
  }
  public static String songComposer(String songTemplate, String land, String aktivitet) {
    String myString = songTemplate.replaceAll("landholder",land);
    myString = myString.replaceAll("landaktivitet",aktivitet);
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
