package Bai_tap_them.Quan_ly_xe.Views;

import Bai_tap_them.Quan_ly_xe.Controllers.CarController;
import Bai_tap_them.Quan_ly_xe.Controllers.MotoController;
import Bai_tap_them.Quan_ly_xe.Models.impl.Truck;

import java.util.Scanner;

public class HienThiPhuongTien {
    private static final CarController carController = new CarController();
    private static final MotoController motoController = new MotoController();
    private static final Truck truck = new Truck();
    private static final Scanner scanner = new Scanner(System.in);
    public static void disPlayCar() {
        System.out.println("Chọn loại xe hiển thị:");
        System.out.println("1. Hiển thị xe tải: ");
        System.out.println("2. Hiển thị oto: ");
        System.out.println("3. Hiển thị xe máy: ");
        System.out.println("4. Trở lại Menu chính: ");

        System.out.print("4. Nhập số muốn chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                break;
            case 2:
                carController.view();
                break;
            case 3:
                break;
            case 4:
                ViewHome.displayMenu();
                break;
        }
    }
}
