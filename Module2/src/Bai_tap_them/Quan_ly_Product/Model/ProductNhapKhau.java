package Bai_tap_them.Quan_ly_Product.Model;

public class ProductNhapKhau extends Product {
    private double giaNhapKhau;
    private String tinhThanhNhap;
    private double thueNhapKhau;

    public ProductNhapKhau() {
    }

    public ProductNhapKhau(double giaNhapKhau, String tinhThanhNhap, double thue) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thue;
    }

    public ProductNhapKhau(int id, String codeProduct, String name, double price, int soLuong, String manufacturer, double giaNhapKhau, String tinhThanhNhap, double thue) {
        super(id, codeProduct, name, price, soLuong, manufacturer);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thue;
    }

    public double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return super.toString() + giaNhapKhau + "," + tinhThanhNhap + "," + thueNhapKhau;
    }
}
