package SS04_Lop_va_doi_tuong_trong_Java.Thuc_hanh;

public class Fan {

    int speed;
    boolean on;
    double radius;
    String color;
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    public Fan() {
        this( 1 , false, 5, "Blue");
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ": Fan is on";
        } else {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ": Fan is off";
        }
    }
}
