package SS08_Clean_Code_Refactoring.Thuc_hanh.Doi_ten_bien_va_tach_hang;

public class Calculator {
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        final char ADDITION = '+';
        final char SUBTRACTION = '-';
        final char MULTIPLICATION = '*';
        final char DIVISION = '/';
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(2,3,'+'));
        System.out.println(calculate(2,3,'-'));
        System.out.println(calculate(2,3,'*'));
        System.out.println(calculate(2,3,'/'));
    }
}
