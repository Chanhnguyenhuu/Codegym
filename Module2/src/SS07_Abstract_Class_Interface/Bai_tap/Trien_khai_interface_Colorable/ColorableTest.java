package SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Colorable;

import SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Resizeable.Circle;
import SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Resizeable.Rectangle;

public class ColorableTest {
    public static void main(String[] args) {
        HinhHoc[] hinhHocs = new HinhHoc[3];
        hinhHocs[0] = new Circle(2,"blue");
        hinhHocs[1] = new Square(3,"red");
        hinhHocs[2] = new Rectange(2,3,"blue");

        for (HinhHoc hinhHoc : hinhHocs) {
            if (hinhHoc instanceof Square) {
                System.out.println(hinhHoc.howToColor());
            }
        }
    }
}
