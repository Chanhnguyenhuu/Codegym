package Banking.Model;

public class TinDungAccount extends Account {
    private String soThe;
    private String maPin;

    public TinDungAccount() {
    }

    public TinDungAccount(String sothe, String maPin) {
        this.soThe = sothe;
        this.maPin = maPin;
    }

    public TinDungAccount(int id, String name, String phone, String birthDay, double sodu, String chiNhanh, String sothe, String maPin) {
        super(id, name, phone, birthDay, sodu, chiNhanh);
        this.soThe = sothe;
        this.maPin = maPin;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getMaPin() {
        return maPin;
    }

    public void setMaPin(String maPin) {
        this.maPin = maPin;
    }

    @Override
    public String toString() {
        return super.toString() + soThe + "," + maPin + "," + getClass().getSimpleName();
    }
}
