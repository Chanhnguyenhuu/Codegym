package SS04_Lop_va_doi_tuong_trong_Java.Thuc_hanh;

public class Rectangle {

    double width;
    double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width " + width + ", height " + height + "}";
    }

}

