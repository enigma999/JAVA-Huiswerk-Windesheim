public class Auto {
    private String merk;
    private String type;
    private int pk;
    private int serialNumber;
    private static int currentSerialNumber =1;
    private boolean heeftProductieFout=false;

    public Auto(String merk, String type, int pk) {
        this.merk = merk;
        this.type = type;
        this.pk = pk;
        this.serialNumber=currentSerialNumber;
        Auto.currentSerialNumber++;
    }


    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "merk='" + merk + '\'' +
                ", type='" + type + '\'' +
                ", pk=" + pk +
                '}';
    }
}
