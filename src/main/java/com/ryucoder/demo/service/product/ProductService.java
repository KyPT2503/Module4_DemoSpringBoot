package com.ryucoder.demo.service.product;

import com.ryucoder.demo.model.Product;
import com.ryucoder.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Product add(Product product) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }
}
