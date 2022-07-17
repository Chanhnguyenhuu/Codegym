package controller;

import model.Product;
import service.IProductService;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product", ""})
public class ProductServlet extends HttpServlet {

    private IProductService iProductService = new ProductService();

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
//            case "delete":
//                showDeleteForm(request, response);
            case "delete":
                deleteProduct(request, response);
                break;
            case "findById":
                findById(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            default:
                productList(request, response);
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("createProduct.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = iProductService.findById(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("deleteProduct.jsp").forward(request, response);
    }

    private void findById(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("findId"));
        Product product = iProductService.findById(id);
        request.setAttribute("product", product);

        try {
            request.getRequestDispatcher("findById.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = iProductService.findById(id);
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("updateForm.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void productList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = iProductService.findAll();
        RequestDispatcher dispatcher = request.getRequestDispatcher("productList.jsp");
        request.setAttribute("product", productList);
        request.getRequestDispatcher("productList.jsp").forward(request, response);
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
//            case "delete":
//                deleteProduct(request, response);
//                break;
            case "edit":
                updateProduct(request, response);
                break;
            default:
                productList(request, response);
        }

    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String category = request.getParameter("category");
        String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        String color = request.getParameter("color");
        Product product = new Product(category, name, price, color);
        iProductService.create(product);
        productList(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        iProductService.delete(id);
        productList(request, response);
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String category = request.getParameter("category");
        String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        String color = request.getParameter("color");
        Product product = new Product(id, category, name, price, color);
        iProductService.edit(product);
        productList(request, response);
    }
}
