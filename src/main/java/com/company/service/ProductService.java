package com.company.service;

import com.company.dao.IProductDao;
import com.company.model.Product;

import java.util.List;

public class ProductService implements IProductService{
    private IProductDao productDao;

    public ProductService(IProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void create(Product product) {

    }

    @Override
    public void updateById(int id, Product product) {

    }

    @Override
    public void deleteById(int id) {

    }
}
