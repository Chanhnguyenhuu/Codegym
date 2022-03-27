package SS04_Lop_va_doi_tuong_trong_Java.Thuc_hanh;

public class QuadraticEquation {

    double a;
    double b;
    double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public String display() {
        if (getDiscriminant() > 0) {
            return "x1 = " + getRoot1() + ", x2 = " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "x1 = x2 = " + getRoot1();
        } else {
            return "The equation has no roots";
        }
    }
}
