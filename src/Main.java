
public class Main {
    public static void main(String[] args) {
        Taxirit rit1 = new Taxirit(400.35);
        Taxirit rit2 = new Taxirit(400.35,4,7);

        rit2.voegPersoonToe();
        rit1.voegPersoonToe();
        rit1.voegPersoonToe(20);
        rit2.voegPersoonToe(3);
        System.out.println(rit1.berekenPrijsPerPersoon());
        System.out.println(rit1.berekenPrijsPerPersoon(30));
    }
}