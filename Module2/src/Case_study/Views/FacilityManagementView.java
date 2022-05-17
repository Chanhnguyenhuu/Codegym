package Case_study.Views;

import java.util.Scanner;

public class FacilityManagementView {

    public static void displayFacilityManagement() {
        System.out.println("Facility Management ");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance ");
        System.out.println("4. Return main menu");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Nhập lựa chọn của ban: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 4);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                FuramaView.displayMenuFurama();
                break;
        }
    }
}
