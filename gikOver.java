import java.util.Scanner;

public class gikOver {
    public static void main(String[] args) {
        hvilketLand("Trampeland", "trampe");
        //hvilketLand("Pegeland", "pege");
        //hvilketLand("Hinkeland", "hinke");
        //hvilketLand("Hoppeland", "hoppe");
        //hvilketLand("Klappeland", "klappe");
        //hvilketLand("Nikkeland", "nikke");
        ditEgetLand();
    }
    
    public static void hvilketLand(String ditLand, String iDitLand) {
        versDel1(ditLand);
        alleDeSom(iDitLand);
        versDel2(ditLand);
    }
    
    public static void ditEgetLand() {
        Scanner input = new Scanner(System.in);
        String ditLandValg;
        String iDitLandValg;
        
        System.out.println("Hvad hedder dit land? (f.eks. Trampeland)");
        ditLandValg = input.nextLine();
        
        System.out.println("Hvad laver man i dit land? (f.eks. trampe)");
        iDitLandValg = input.nextLine();
        System.out.println();
        
        versDel1(ditLandValg);
        alleDeSom(iDitLandValg);
        versDel2(ditLandValg);
    }
    
    public static void versDel1(String land) {
        indtilDetGivneLand();
        System.out.println("\"Jeg har hjemme i " + land + ", ");
        System.out.println(land + ", " + land + ", ");
        
    }
    
    public static void alleDeSom(String landKan) {
        System.out.println("og alle de som " + landKan + " kan,");
    }
    
    public static void versDel2(String land) {
        System.out.println("de har hjemme i " + land + "\".\n");
    }
    
    public static void indtilDetGivneLand() {
        System.out.println("Jeg gik mig over soe og land,");
        System.out.println("Der moedte jeg en gammel mand.");
        System.out.println("Han sa'e saa og spurgte saa:");
        System.out.println("\"Og hvor har du vel hjemme?\"");
    }
}
