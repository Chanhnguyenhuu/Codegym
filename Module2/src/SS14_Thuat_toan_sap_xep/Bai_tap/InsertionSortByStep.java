package SS14_Thuat_toan_sap_xep.Bai_tap;

import java.util.Scanner;

public class InsertionSortByStep {

    public static void insertionSortByStep(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Gán key = " + arr[i] + " và j = " + (i - 1));
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                System.out.println("Gán " + arr[j] + " vào vị trí index = " + (j + 1));
                arr[j + 1] = arr[j];
                j--;
            }

            System.out.print("List after the  " + i + "' sort: ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + "\t");
            }
            System.out.println();

            System.out.println("Gán " + key + " vào vị trí index = " + (j + 1));
            arr[j + 1] = key;

            System.out.print("List after the  " + i + "' sort: ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");

        insertionSortByStep(list);
    }
}
