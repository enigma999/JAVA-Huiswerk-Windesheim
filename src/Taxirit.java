public class Taxirit {
    private double prijsPerKm = 1.25;
    private int aantalPers;
    private int maxAantal;
    private double afstand;

    public Taxirit(double afstand){
        this.afstand=afstand;
    }

    public Taxirit(double afstand, int aantalPers, int maxAantal){
        this.afstand= afstand;
        this.aantalPers= aantalPers;
        this.maxAantal= maxAantal;
    }

    public void voegPersoonToe(){
            if(this.aantalPers<this.maxAantal){
                this.aantalPers++;
            }else{
                System.out.println("Sorry de taxi zit vol.");
            }
    }

    public void voegPersoonToe(int aantalPers){
        if((this.aantalPers+aantalPers)<=this.maxAantal){
            this.aantalPers=+aantalPers;
        }else{
            System.out.println("Sorry dit past niet.");
        }
    }

    public double berekenPrijsPerPersoon(){
        double ritPrijs=this.afstand*this.prijsPerKm;
        if(this.aantalPers==this.maxAantal){
            ritPrijs=ritPrijs*0.9;
        }
        return ritPrijs;
    }

    public double berekenPrijsPerPersoon(double koritingsPercentage){
        double ritPrijs=this.afstand*this.prijsPerKm;
        double kortingsfactor=1-(koritingsPercentage/100);
        ritPrijs=ritPrijs*kortingsfactor;

        return ritPrijs;
    }

}
