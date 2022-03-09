package com.company.dao;

import com.company.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProductDao{
    List<Product> products = new ArrayList<>();
    public ProductDao() {
    }

    public Connection getConnection() { //để tạo kết nối đến CSDL.
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management", "root","123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public List findAll() {
        Connection connection = getConnection();//tạo kết nối để sử dụng đc lệnh truy vấn dữ liệu
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                String description = resultSet.getString("description");
                Product product = new Product(id, name, price, description);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public void create(Object o) {

    }

    @Override
    public void updateById(int id, Object o) {

    }

    @Override
    public void deleteById(int id) {

    }
}
