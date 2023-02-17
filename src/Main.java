
public class Main {
    public static void main(String[] args) {
        System.out.println("aantal: " +
                Fabriek.totaalAantalGemaakteAutos); // 0
        Fabriek fabriek = new Fabriek();
        Auto a = fabriek.maakAuto();
        Auto bb = fabriek.maakAuto();
        System.out.println("aantal: " +
                Fabriek.totaalAantalGemaakteAutos); // 2
        Fabriek fabriekTwee = new Fabriek();
        Auto ccc = fabriekTwee.maakAuto();
        Auto dddd = fabriekTwee.maakAuto();
        Auto eeeee = fabriek.maakAuto();
        System.out.println("aantal: " +
                Fabriek.totaalAantalGemaakteAutos); // 5
        System.out.println(fabriekTwee.aantalGemaakteAutos);
        System.out.println(fabriek.aantalGemaakteAutos);

    }
}