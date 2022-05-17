package Bai_tap_them.Quan_ly_xe.Views;

import java.util.Scanner;

public class ViewHome {
    public static void displayMenu() {
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị phương tiện");
        System.out.println("3. Xoá phương tiện");
        System.out.println("4. Thoát");
        System.out.print("Chọn chức năng: ");

        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                ThemPhuongTien.displayPhuongTien();
                break;
            case 2:
                HienThiPhuongTien.disPlayCar();
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
