package SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
//        Circle[] circle = new Circle[3];
//        circle[0] = new Circle();
//        circle[1] = new Circle(2.5);
//        circle[2] = new Circle(3.2, "Blue");
//
//        for(Circle circles : circle) {
//            System.out.println(circles.resize(2));
//        }

        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle(3,2);
        rectangle[1] = new Rectangle(4,5);
        rectangle[2] = new Rectangle(6,7);

        for (Rectangle rectangle1 : rectangle) {
            System.out.println(rectangle1.resize(2));
        }
    }
}
