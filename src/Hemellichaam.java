public class Hemellichaam {
    private String naam;
    private String type;
    private int tempMin;
    private int tempMax;

    public Hemellichaam(String naam, String type) {
        this.naam = naam;
        this.type = type;
    }

    public Hemellichaam(String naam) {
        this.naam = naam;
        this.type = "onbekend";
    }

    public String getNaam() {
        return this.naam;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        System.out.println("het type van " + this.naam + " is veranderd van " + this.type + " naar " + type);
        this.type = type;
    }

    @Override
    public String toString() {
        return this.naam + "(" + this.type + ")";
    }

    public void setTemperatuur(int temp) {
        this.tempMax = temp;
        this.tempMin = temp;
    }

    public void setTemperatuur(int tempMin, int tempMax) {
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }
    public void printTemperatuur(){
        if(this.tempMax==this.tempMin) {
            System.out.println("het is ongeveer " + this.tempMax + " graden");
        }else{
            System.out.println("het is minimaal " + this.tempMin + " graden , en maximaal " + this.tempMax + " graden");
        }
    }
}
