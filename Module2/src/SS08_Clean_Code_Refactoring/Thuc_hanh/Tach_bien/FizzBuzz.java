package SS08_Clean_Code_Refactoring.Thuc_hanh.Tach_bien;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        final boolean isFizz = number % 3 == 0;
        final boolean isBuzz = number % 5 == 0;
        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(2));
    }
}
