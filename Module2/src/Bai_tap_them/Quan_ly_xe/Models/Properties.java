package Bai_tap_them.Quan_ly_xe.Models;

public class Properties {
    private static final String COMMA = ",";
    private String bienSoXe;
    private String hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public Properties() {
    }

    public Properties(String bienSoXe, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienSoXe = bienSoXe;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return bienSoXe + COMMA + hangSanXuat + COMMA +
                COMMA+ namSanXuat +
                COMMA + chuSoHuu + COMMA ;
    }
}
