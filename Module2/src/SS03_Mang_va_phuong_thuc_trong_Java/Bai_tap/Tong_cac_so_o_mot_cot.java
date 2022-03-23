package SS03_Mang_va_phuong_thuc_trong_Java.Bai_tap;

import java.util.Scanner;

public class Tong_cac_so_o_mot_cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột của ma trận: ");
        int col = Integer.parseInt(scanner.nextLine());

        while (row<=0||col<=0) {
            System.out.print("Nhập sai, xin nhập lại số hàng của ma trận: ");
            row = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập sai, xin nhập lại số cột của ma trận: ");
            col = Integer.parseInt(scanner.nextLine());
        }

        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập giá trị tai vị trí (" + i + " ; " + j + ") của ma trận");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int result = 0;
        System.out.println("Nhập cột muốn tính tổng: ");
        int colAdd = Integer.parseInt(scanner.nextLine());

        System.out.println("Ma trận nhận được là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println("");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == colAdd-1) {
                    result += array[i][j];
                }
            }
        }
        System.out.println("Tổng các số cột " + colAdd + " bằng: " + result);
    }
}
