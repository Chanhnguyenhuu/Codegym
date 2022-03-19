package SS01_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class Doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num = scanner.nextInt();
        if (num > 0 && num <= 10) {
            switch (num) {
                case 0:
                    System.out.println("Không");
                    break;
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
                default:
                    System.out.println("Out of ability");
                    break;
            }
        }
        if (num >= 10 && num < 20) {

        }
    }
}
