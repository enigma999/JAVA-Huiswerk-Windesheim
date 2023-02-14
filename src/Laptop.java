public class Laptop {
    private String naam;
    private String OS;
    private int schermdiagonaal;

    public Laptop() {
        System.out.println("geef een naam op");
    }

    public Laptop(String naam) {
        this.naam = naam;
    }


    public Laptop(String naam, String OS, int schermdiagonaal) {
        this.naam = naam;
        this.OS = OS;
        this.schermdiagonaal = schermdiagonaal;
    }
}
