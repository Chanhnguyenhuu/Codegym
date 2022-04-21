package SS14_Thuat_toan_sap_xep.Bai_tap;

public class InsertionSort {
    static int[] arr = {5, 6, 4, 3, 8, 1, 9};

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
        System.out.println();
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
