public class Laptop {
    private String naam;
    private String OS;
    private int schermdiagonaal;


    public Laptop(String naam) {
        this.naam = naam;

    }


    public Laptop(String naam, String OS, int schermdiagonaal) {
        this.naam = naam;

        this.schermdiagonaal = schermdiagonaal;
        switch (OS.toUpperCase()) {
            case "WINDOWS":
                this.OS = OS;
                break;
            case "MACOS":
                this.OS = OS;
                break;
            case "LINUX":
                this.OS = OS;
                break;
            default:
                this.OS = "undefined";
                System.out.println("geen geldige OS. kies uit Windows, macOS, Linux");
                break;
        }
        if(10<schermdiagonaal&&24>schermdiagonaal) {
            this.schermdiagonaal=schermdiagonaal;
        }else {
            System.out.println("Geen geldige schermdiagonaal. geef een waarde op tussen 10 en 24");
        }


    }

//        this.schermdiagonaal = schermdiagonaal;
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
