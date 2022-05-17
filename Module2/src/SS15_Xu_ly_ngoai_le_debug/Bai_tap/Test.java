package SS15_Xu_ly_ngoai_le_debug.Bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập cạnh thứ hai: ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập cạnh thứ ba: ");
            double c = Double.parseDouble(scanner.nextLine());
            Triangle triangle = new Triangle(a,b,c);
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println();
        }
    }
}
