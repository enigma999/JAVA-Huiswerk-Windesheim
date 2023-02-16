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
        if(OS)
        this.OS = OS;
        this.schermdiagonaal = schermdiagonaal;
    }

    public String getNaam() {
        return naam;
    }

    public String getOS() {
        return OS;
    }

    public int getSchermdiagonaal() {
        return schermdiagonaal;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setSchermdiagonaal(int schermdiagonaal) {
        this.schermdiagonaal = schermdiagonaal;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "naam='" + naam + '\'' +
                ", OS='" + OS + '\'' +
                ", schermdiagonaal=" + schermdiagonaal +
                '}';
    }
}
