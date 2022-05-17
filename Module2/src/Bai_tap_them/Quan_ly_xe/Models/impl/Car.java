package Bai_tap_them.Quan_ly_xe.Models.impl;

import Bai_tap_them.Quan_ly_xe.Models.Properties;

public class Car extends Properties {
    private static final String COMMA = ",";
    private int soChoNgoi;
    private String kieuXe;

    public Car() {
    }

    public Car(int soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Car(String bienSoXe, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienSoXe, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return  super.toString() + soChoNgoi +
                COMMA + kieuXe;
    }
}
