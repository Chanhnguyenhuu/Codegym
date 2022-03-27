package SS04_Lop_va_doi_tuong_trong_Java.Thuc_hanh;

import com.sun.org.apache.bcel.internal.Const;
import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //------------Bai_1
//        System.out.print("Enter the width: ");
//        double width = Double.parseDouble(scanner.nextLine());
//        System.out.print("Enter the height: ");
//        double height = Double.parseDouble(scanner.nextLine());
//
//        Rectangle rectangle = new Rectangle(width, height);
//        System.out.println("Your rectangle " + rectangle.display());
//        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
//        System.out.println("Area of the Rectangle: " + rectangle.getArea());

        //-----------Bai_2
//        System.out.print("Nhập hệ số a: ");
//        double a = Double.parseDouble(scanner.nextLine());
//        System.out.print("Nhập hệ số b: ");
//        double b = Double.parseDouble(scanner.nextLine());
//        System.out.print("Nhập hệ số c: ");
//        double c = Double.parseDouble(scanner.nextLine());
//
//        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
//        System.out.println(quadraticEquation.display());

        //------------Bai_3
//        StopWatch stopWatch = new StopWatch();
//        System.out.println("Thời gian bắt đầu" + stopWatch.start());
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("Hello");
//        }
//        System.out.println("Thời gian kết thúc" + stopWatch.stop());
//        System.out.println(stopWatch.display());

        //-------------Bai_4

        Fan fan1 = new Fan(1, true, 10, "Yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(2, false, 5, "Blue");
        System.out.println(fan2.toString());
    }
}

