package com.company.controller;

import com.company.dao.ProductDao;
import com.company.model.Product;
import com.company.service.IProductService;
import com.company.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private IProductService productService;

    public ProductServlet(IProductService productService) {
        this.productService = new ProductService(new ProductDao());/////
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            default:{
                List<Product> products = productService.findAll();
                request.setAttribute("products",products);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/product/list.jsp");
                dispatcher.forward(request,response);
            }
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
