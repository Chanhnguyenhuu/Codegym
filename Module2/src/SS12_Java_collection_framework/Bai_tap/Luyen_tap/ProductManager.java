package SS12_Java_collection_framework.Bai_tap.Luyen_tap;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
    ArrayList<Product> list = new ArrayList<>();

    public void add(Product product) {
        list.add(product);
    }

    public void remove(Product product) {
        list.remove(product);
    }

    public void update(Product product, String name) {
        product.setName(name);
    }

    public void update(Product product, double price) {
        product.setPrice(price);
    }

    public void display() {
        for (Product product: list) {
            System.out.println("Id " + product.getId() + ", Name " + product.getName() + ", Price " + product.getPrice());
        }
    }

    public void find(String name) {
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println("Id " + list.get(i));
                check = true;
                return;
            }
        }
        if (!check) {
            System.out.println("Sản phẩm không có trong danh sách.");
        }
    }

    public void sort() {
        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }
}
