package SS03_Mang_va_phuong_thuc_trong_Java.Bai_tap;

import java.util.Scanner;

public class Tim_min_trong_mang {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập kích thước của mảng: ");
//        int size = scanner.nextInt();
//        while (size <= 0) {
//            System.out.print("Nhập sai, xin nhập lại kích thước của mảng: ");
//            size = scanner.nextInt();
//        }
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
//            array[i] = scanner.nextInt();
//        }
//
//        int min = array[0];
//        for (int i = 0; i < size; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
        int[] array = SetArray();
        int min = GetMin(array);
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
    }

    public static int GetMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] SetArray() {
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
        return array;
    }
}
