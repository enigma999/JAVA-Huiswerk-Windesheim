import java.util.ArrayList;

public class Fabriek {
    private String naam;
    int aantalGemaakteAutos;
    static int totaalAantalGemaakteAutos;
    private ArrayList<Integer> autos;
    private int productieFouten;
    private ArrayList<Integer> autosMetProductiefouten;

    public Fabriek() {
        this.naam = "tesla";
        this.aantalGemaakteAutos = 0;
        autosMetProductiefouten = new ArrayList<>();
        autos = new ArrayList<>();
    }

    public Auto maakAuto() {
        String type = "Model 3";
        this.aantalGemaakteAutos++;
        totaalAantalGemaakteAutos++;
        Auto auto =  new Auto(this.naam, type, 360);
        this.autos.add(auto.getSerialNumber());
        return auto;
    }

    public int getProductieFouten() {
        return productieFouten;
    }

    public void registreerProductieFout(int serieNummer) {
        if (this.autos.contains(serieNummer)) {
            if (!this.autosMetProductiefouten.contains(serieNummer)) {
                this.productieFouten++;
                this.autosMetProductiefouten.add(serieNummer);
            }else{
                System.out.println("deze auto staat al geregistreerd met een productie fout");
            }
        }else{
            System.out.println("deze auto staat niet geregistreerd in deze fabriek");
        }
    }

}
