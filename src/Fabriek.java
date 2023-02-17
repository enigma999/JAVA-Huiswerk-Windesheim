public class Fabriek {
    private String naam;
    int aantalGemaakteAutos;
    static int totaalAantalGemaakteAutos;
    public Fabriek() {
        this.naam="tesla";
        this.aantalGemaakteAutos=0;
    }

    public Auto maakAuto(){
        String type = "Model 3";
        this.aantalGemaakteAutos++;
        totaalAantalGemaakteAutos++;
        return new Auto(this.naam,type,360);
    }

}
