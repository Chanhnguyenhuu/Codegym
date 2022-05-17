package Bai_tap_them.Quan_ly_Product.Model;

public abstract class Product {
    private int id;
    private String codeProduct;
    private String name;
    private double price;
    private int soLuong;
    private String manufacturer;

    public Product() {
    }

    public Product(int id, String codeProduct,String name, double price, int soLuong,String manufacturer) {
        this.id = id;
        this.codeProduct = codeProduct;
        this.name = name;
        this.price = price;
        this.soLuong = soLuong;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,", id, codeProduct ,name, price, soLuong ,manufacturer);
    }
}
