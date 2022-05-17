package SS15_Xu_ly_ngoai_le_debug.Bai_tap;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws TriangleException {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleException("Kích thước cạnh không được nhỏ hơn hoặc bằng 0");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleException("Tổng hai cạnh không được nhỏ hơn hoặc bằng cạnh thứ ba");
        }
    }
}
