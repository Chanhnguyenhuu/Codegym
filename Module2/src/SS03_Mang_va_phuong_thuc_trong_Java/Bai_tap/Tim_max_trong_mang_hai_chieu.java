package SS03_Mang_va_phuong_thuc_trong_Java.Bai_tap;

import java.util.Scanner;

public class Tim_max_trong_mang_hai_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int col = scanner.nextInt();

        while (row<=0||col<=0) {
            System.out.print("Nhập sai, xin nhập lại số hàng của ma trận: ");
            row = scanner.nextInt();
            System.out.print("Nhập sai, xin nhập lại số cột của ma trận: ");
            col = scanner.nextInt();
        }

        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập giá trị tai vị trí (" + i + " ; " + j + ") của ma trận");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận nhận được là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println("");
        }

//        int[][] array = {
//                {3, 2, 5, 6, 9},
//                {12, 45, 16, 13, 8},
//                {24, 33, 91, 22, 51},
//                {7, 61, 44, 37, 23},
//                {81, 4, 72, 27, 66}
//        };
//
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
