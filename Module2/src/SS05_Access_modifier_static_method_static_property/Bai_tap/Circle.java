package SS05_Access_modifier_static_method_static_property.Bai_tap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(double radius) {
        return this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
