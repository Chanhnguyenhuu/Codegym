package Banking.Model;

public class Account {
    private int id;
    private String name;
    private String phone;
    private String birthDay;
    private double sodu;
    private String chiNhanh;

    public Account() {
    }

    public Account(int id, String name, String phone, String birthDay, double sodu, String chiNhanh) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birthDay = birthDay;
        this.sodu = sodu;
        this.chiNhanh = chiNhanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public double getSodu() {
        return sodu;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    public String getChiNhanh() {
        return chiNhanh;
    }

    public void setChiNhanh(String chiNhanh) {
        this.chiNhanh = chiNhanh;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,",id, name, phone, birthDay, sodu, chiNhanh);
    }
}
