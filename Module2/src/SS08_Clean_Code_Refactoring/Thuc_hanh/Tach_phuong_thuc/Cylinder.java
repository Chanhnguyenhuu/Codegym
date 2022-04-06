package SS08_Clean_Code_Refactoring.Thuc_hanh.Tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = getVolume(height, baseArea, perimeter);
        return volume;
    }

    private static double getVolume(int height, double baseArea, double perimeter) {
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }

    public static void main(String[] args) {
        System.out.println(getVolume(2,3));
    }
}
