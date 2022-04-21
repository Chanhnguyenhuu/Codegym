package SS12_Java_collection_framework.Bai_tap.Luyen_tap;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Coca",15000);
        Product product2 = new Product(2,"Pepsi",10000);
        Product product3 = new Product(3,"Bakery",25000);
        Product product4 = new Product(4,"Orange",5000);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        productManager.sort();
        System.out.println("Danh sách");
        productManager.display();
        System.out.println("Tìm theo tên");
        productManager.find("Coca");
        System.out.println("Update giá");
        productManager.update(product2, 30000);
        productManager.sort();
        productManager.display();

    }
}
