package Vong_lap_trong_Java.Bai_tap;

import java.util.Scanner;

public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Tam giác vuông trên bên trái");
        System.out.println("3. Tam giác vuông trên bên phải");
        System.out.println("4. Tam giác vuông dưới bên trái");
        System.out.println("5. Tam giác vuông dưới bên phải");
        System.out.println("6. Tam giác cân");
        System.out.println("0. Exit");
        System.out.println("Nhập số muốn chọn");
        int choice = scanner.nextInt();

        while (choice < 0 || choice > 6) {
            System.out.println("Nhập sai, xin hãy nhập lại số muốn chọn");
            choice = scanner.nextInt();
        }

        System.out.println("Nhập chiều cao");
        int cao = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hãy nhập chiều rộng");
                int rong = scanner.nextInt();
                while (cao<=0||rong<=0) {
                    System.out.println("Nhập sai, xin hãy nhập lại chiều cao");
                    cao = scanner.nextInt();
                    System.out.println("Nhập sai, xin hãy nhập lại chiều rộng");
                    rong = scanner.nextInt();
                }
                for (int i = 0; i < cao; i++) {
                    for (int j = 0; j < rong; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                while (cao<=0) {
                    System.out.println("Nhập sai, xin hãy nhập lại chiều cao");
                    cao = scanner.nextInt();
                }
                for (int i = 0; i < cao; i++) {
                    for (int j = 0; j < cao; j++) {
                        if (i + j <= cao - 1) {
                            System.out.print(" * ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                while (cao<=0) {
                    System.out.println("Nhập sai, xin hãy nhập lại chiều cao");
                    cao = scanner.nextInt();
                }
                for (int i = 0; i < cao; i++) {
                    for (int j = 0; j < cao; j++) {
                        if (i <= j) {
                            System.out.print(" * ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 4:
                while (cao<=0) {
                    System.out.println("Nhập sai, xin hãy nhập lại chiều cao");
                    cao = scanner.nextInt();
                }
                for (int i = 0; i < cao; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 5:
                while (cao<=0) {
                    System.out.println("Nhập sai, xin hãy nhập lại chiều cao");
                    cao = scanner.nextInt();
                }
                for (int i = 0; i < cao; i++) {
                    for (int j = 0; j < cao; j++) {
                        if (i + j >= cao - 1) {
                            System.out.print(" * ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 6:
                while (cao<=0) {
                    System.out.println("Nhập sai, xin hãy nhập lại chiều cao");
                    cao = scanner.nextInt();
                }
                int center = cao - 1;
                System.out.println(center);

                for (int i = 0; i < cao; i++) {
                    for (int j = 0; j < 2 * cao + 1; j++) {
                        if (j >= center - i && j <= center + i) {
                            System.out.print(" * ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Chưa nhập giá trị");

        }
    }
}
