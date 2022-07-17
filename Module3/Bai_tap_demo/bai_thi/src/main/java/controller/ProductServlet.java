package controller;

import model.Category;
import model.Product;
import service.CategoryService;
import service.ICategoryService;
import service.IProductService;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product", ""})
public class ProductServlet extends HttpServlet {

    private ICategoryService categoryService = new CategoryService();
    private IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                //showEditForm(request, response);
                break;
            case "delete":
                //deleteProduct(request, response);
                break;
            case "findById":
                //findById(request, response);
                break;
            default:
               productList(request, response);
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<Category> categoryList = categoryService.findAll();
        request.setAttribute("category", categoryList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/createProduct.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void productList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productService.findAll();
        request.setAttribute("product", productList);
        request.getRequestDispatcher("/productList.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                //updateProduct(request, response);
                break;
            case "delete":
                break;
            case "findById":
                findById(request, response);
                break;
            default:
                productList(request, response);
        }
    }

    private void findById(HttpServletRequest request, HttpServletResponse response) {

    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        String color = request.getParameter("color");
        String describe = request.getParameter("describe");
        int id_category = Integer.parseInt(request.getParameter("category"));
        Category category = categoryService.findById(id_category);
        Product product = new Product(name, price, amount, color, describe, category);
        productService.create(product);
        productList(request, response);
    }
}
