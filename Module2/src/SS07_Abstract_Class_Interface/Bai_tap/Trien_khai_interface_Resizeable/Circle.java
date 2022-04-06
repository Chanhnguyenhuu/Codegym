package SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Resizeable;

import SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Colorable.HinhHoc;

public class Circle extends HinhHoc {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Hình tròn có bán kính "
                + radius + " và có màu "
                + color;
    }

    @Override
    public String resize(double percent) {
        return "CircleResize " + getArea() * percent;
    }

    @Override
    public String howToColor() {
        return "Color all four sides: " + getColor();
    }
}
