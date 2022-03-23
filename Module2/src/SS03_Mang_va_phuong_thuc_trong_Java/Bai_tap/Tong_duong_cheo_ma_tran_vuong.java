package SS03_Mang_va_phuong_thuc_trong_Java.Bai_tap;

import java.util.Scanner;

public class Tong_duong_cheo_ma_tran_vuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận vuông: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột của ma trận vuông: ");
        int col = Integer.parseInt(scanner.nextLine());

        while (row <= 0 || col <= 0 || col != row) {
            System.out.print("Nhập sai, xin nhập lại số hàng của ma trận vuông: ");
            row = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập sai, xin nhập lại số cột của ma trận vuông: ");
            col = Integer.parseInt(scanner.nextLine());
        }

        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập giá trị tai vị trí (" + i + " ; " + j + ") của ma trận: ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Menu");
        System.out.println("1. Tổng đường chéo thứ nhất:");
        System.out.println("2. Tổng đường chéo thứ hai:");
        System.out.print("Nhập số muốn chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        int result = 0;

        switch (choice) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        if (i == j) {
                            result += array[i][j];
                        }
                    }
                }
                System.out.println("Tổng đường chéo thứ nhất là: " + result);
                break;
            case 2:
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        if (i + j == array.length-1) {
                            result += array[i][j];
                        }
                    }
                }
                System.out.println("Tổng đường chéo thứ hai là: " + result);
                break;
        }
        System.out.println("Ma trận nhận được là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println("");
        }
    }
}
