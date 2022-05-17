package Bai_tap_them.Quan_ly_Product.Service;

import Bai_tap_them.Quan_ly_Product.Model.Product;
import Bai_tap_them.Quan_ly_Product.Model.ProductNhapKhau;
import Bai_tap_them.Quan_ly_Product.Model.ProductXuatKhau;
import Bai_tap_them.Quan_ly_Product.Util.ConstantUtil;
import Bai_tap_them.Quan_ly_Product.Util.FileHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();

    public ProductService() {
        products = mapToProduct();
    }

    public void create(Product product) {
        int lastId = 0;
        if (products.size() > 0) {
            lastId = products.get(products.size() - 1).getId();
        }
        product.setId(lastId + 1);
        products.add(product);
        fileHelper.write(ConstantUtil.path, Collections.singletonList(product), true);
    }

    public List findAll() {
        return products;
    }

    public void delete(String codeProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCodeProduct().equals(codeProduct)) {
                products.remove(i);
                fileHelper.write(ConstantUtil.path, products, false);
                return;
            }
        }
    }

    public List searchByName(String name) {
        List result = new ArrayList();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                result.add(products.get(i));
            }
        }
        return result;
    }

    private List mapToProduct() {
        List result = new ArrayList();

        List<String> lines = fileHelper.read(ConstantUtil.path);
        for (String line : lines) {
            String[] tmp = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String codeProduct = tmp[1];
            String name = tmp[2];
            double price = Double.parseDouble(tmp[3]);
            int soLuong = Integer.parseInt(tmp[4]);
            String manufacturer = tmp[5];

            if (tmp.length == 9) {
                int productNhapKhau = Integer.parseInt(tmp[6]);
                String tinhThanhNhap = tmp[7];
                double thueNhapKhau = Double.parseDouble(tmp[8]);
                result.add(new ProductNhapKhau(id, codeProduct, name, price, soLuong, manufacturer, productNhapKhau, tinhThanhNhap, thueNhapKhau));
            } else {
                double giaXuatKhau = Double.parseDouble(tmp[6]);
                String quocGiaNhap = tmp[7];
                result.add(new ProductXuatKhau(id, codeProduct, name, price, soLuong, manufacturer, giaXuatKhau, quocGiaNhap));
            }
        }
        return result;
    }
}
