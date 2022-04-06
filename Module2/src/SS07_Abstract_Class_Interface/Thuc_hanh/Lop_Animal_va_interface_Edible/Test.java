package SS07_Abstract_Class_Interface.Thuc_hanh.Lop_Animal_va_interface_Edible;

public class Test {
    public static void main(String[] args) {

        //------------TestAnimal
//        Tiger tiger = new Tiger();
//        System.out.println(tiger.makeSound());
//
//        Chicken chicken = new Chicken();
//        System.out.println(chicken.makeSound());
//        System.out.println(chicken.howToEat());

        //--------TestFruit
        Apple apple = new Apple();
        System.out.println(apple.howToEat());

        Orange orange = new Orange();
        System.out.println(orange.howToEat());
    }
}
