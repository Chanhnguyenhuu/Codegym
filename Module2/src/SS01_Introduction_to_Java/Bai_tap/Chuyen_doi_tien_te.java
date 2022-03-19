package SS01_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rate = 23000;

        System.out.print("VND: ");
        float VND = scanner.nextFloat();

        System.out.println("USD: " + VND/rate);
    }
}
