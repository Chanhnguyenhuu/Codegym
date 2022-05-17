package Bai_tap_them.Quan_ly_Product.Model;

public class ProductXuatKhau extends Product {
    private double giaXuatKhau;
    private String quocGiaNhap;

    public ProductXuatKhau() {
    }

    public ProductXuatKhau(double giaXuatKhau, String quocGiaNhap) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public ProductXuatKhau(int id, String codeProduct, String name, double price, int soLuong, String manufacturer, double giaXuatKhau, String quocGiaNhap) {
        super(id, codeProduct, name, price, soLuong, manufacturer);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhap() {
        return quocGiaNhap;
    }

    public void setQuocGiaNhap(String quocGiaNhap) {
        this.quocGiaNhap = quocGiaNhap;
    }

    @Override
    public String toString() {
        return super.toString() + giaXuatKhau + "," + quocGiaNhap;
    }
}
