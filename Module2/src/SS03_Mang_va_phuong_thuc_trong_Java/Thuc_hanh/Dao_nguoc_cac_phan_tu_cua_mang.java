package SS03_Mang_va_phuong_thuc_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Dao_nguoc_cac_phan_tu_cua_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        while (size <= 0) {
            System.out.print("Nhập sai, xin nhập lại kích thước của mảng: ");
            size = scanner.nextInt();
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size / 2; i++) {
            int a = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = a;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Mảng đảo ngược là: " + array[i]);
        }
    }
}
