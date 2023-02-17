public class Laptop {
    private String naam;
    private String OS;
    private int schermdiagonaal;


    public Laptop(String naam) {
        this.naam = naam;

    }


    public Laptop(String naam, String OS, int schermdiagonaal) {
        this.naam = naam;
        switch (OS.toUpperCase()) {
            case "WINDOWS", "LINUX", "MACOS" -> this.OS = OS;
            default -> {
                this.OS = "undefined";
                System.out.println("geen geldige OS. kies uit Windows, macOS, Linux");
            }
        }
        if(10<schermdiagonaal&&24>schermdiagonaal) {
            this.schermdiagonaal=schermdiagonaal;
        }else {
            System.out.println("Geen geldige schermdiagonaal. geef een waarde op tussen 10 en 24");
        }


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
