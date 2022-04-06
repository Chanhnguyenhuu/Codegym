package SS05_Access_modifier_static_method_static_property.Bai_tap;

public class TestCircle {
    public static void main(String[] args) {

        //-------------TestCircle
        Circle circle1 = new Circle();
        System.out.println(circle1.getArea());
        Circle circle2 = new Circle(2);
        System.out.println(circle2.getArea());

        //----------TestStudent
//        Student student = new Student();
//        System.out.println(student.getName());
//        student.setName("Hoa");
//        student.setClasses("CO");
//        System.out.println(student.getName());
//        System.out.println(student.getClasses());
    }
}
