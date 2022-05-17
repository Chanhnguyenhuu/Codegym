package Case_study.Views;

import java.util.Scanner;

public class PromotionManagementView {

    public static void displayPromotionManagement() {
        System.out.println("Promotion Management");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Nhập lựa chọn của ban: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 3);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                FuramaView.displayMenuFurama();
                break;
        }
    }
}
