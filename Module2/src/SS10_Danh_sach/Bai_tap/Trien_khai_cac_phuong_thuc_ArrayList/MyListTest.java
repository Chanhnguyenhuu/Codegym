package SS10_Danh_sach.Bai_tap.Trien_khai_cac_phuong_thuc_ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(0,0);
        listInteger.add(1,1);
        listInteger.add(2,2);
        listInteger.add(3,3);
        listInteger.add(4,4);
        listInteger.add(5,5);
        listInteger.add(6,6);
        listInteger.add(7,7);
        listInteger.add(8,8);
        listInteger.add(9,9);
        listInteger.add(10,10);
        listInteger.add(11,11);

        System.out.println(listInteger.getSize());
        listInteger.remove(7);
        System.out.println(listInteger.getSize());

        for (int i = 0; i < listInteger.getSize(); i++) {
            System.out.println(listInteger.get(i));
        }
    }
}
