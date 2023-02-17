public class Auto {
    private String merk;
    private String type;
    private int pk;

    public Auto(String merk, String type, int pk) {
        this.merk = merk;
        this.type = type;
        this.pk = pk;
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

    @Override
    public String toString() {
        return "Auto{" +
                "merk='" + merk + '\'' +
                ", type='" + type + '\'' +
                ", pk=" + pk +
                '}';
    }
}
