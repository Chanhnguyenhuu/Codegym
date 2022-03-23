package SS03_Mang_va_phuong_thuc_trong_Java.Bai_tap;

import java.util.Scanner;

public class Xoa_phan_tu_cua_mang {
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
        System.out.print("Nhập phần tử cần xoá: ");
        int del = scanner.nextInt();
        int index = -1;
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == del) {
                check = true;
                index = i;
                System.out.println("Phần tử " + del + " nằm tại vị trí thứ " + (index + 1) + " trong mảng");
                break;
            }
        }

        if (!check) {
            System.out.println("Phần tử " + del + " không tồn tại trong mảng");
        }
        if (check) {
            for (int i = index; i < size-1; i++) {
                array[i] = array[i+1];
            }
            array[size-1] = 0;
        }

        System.out.println("Mảng sau khi xoá phần tử là: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
