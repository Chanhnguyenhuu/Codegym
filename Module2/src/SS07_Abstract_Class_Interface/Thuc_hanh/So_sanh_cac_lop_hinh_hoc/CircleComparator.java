package SS07_Abstract_Class_Interface.Thuc_hanh.So_sanh_cac_lop_hinh_hoc;

import SS06_Ke_thua.Thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) {
            return 1;
        } else if (o1.getRadius() < o2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
