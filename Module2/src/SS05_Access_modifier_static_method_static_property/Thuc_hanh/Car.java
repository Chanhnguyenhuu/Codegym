package SS05_Access_modifier_static_method_static_property.Thuc_hanh;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
}
