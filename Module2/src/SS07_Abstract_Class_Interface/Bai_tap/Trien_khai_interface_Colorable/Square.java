package SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Colorable;

import SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Resizeable.Rectangle;

public class Square extends HinhHoc {

    private double canh;
    private String color;
    public Square() {
    }

    public Square(double canh, String color) {
        this.canh = canh;
        this.color = color;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return getCanh() * getCanh();
    }
    @Override
    public String howToColor() {
        return "Color all four sides " + getColor();
    }

    @Override
    public String resize(double percent) {
        return "SquareResize " + getArea() * percent;
    }
}
