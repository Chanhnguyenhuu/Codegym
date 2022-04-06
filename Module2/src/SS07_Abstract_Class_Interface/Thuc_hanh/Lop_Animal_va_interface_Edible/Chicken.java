package SS07_Abstract_Class_Interface.Thuc_hanh.Lop_Animal_va_interface_Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Ò ó o";
    }

    @Override
    public String howToEat() {
        return "Chicken: Chiên";
    }
}
