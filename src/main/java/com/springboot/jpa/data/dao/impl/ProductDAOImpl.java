package com.springboot.jpa.data.dao.impl;

import com.springboot.jpa.data.dao.ProductDAO;
import com.springboot.jpa.data.entity.Product;
import com.springboot.jpa.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product insertProduct(Product product) {
        Product insertedProduct = productRepository.save(product);
        return insertedProduct;
    }

    @Override
    public Product selectProduct(Long number) throws Exception {
        Product selected = productRepository.findById(number)
        .orElseThrow(()-> new Exception("요청한 내용을 찾을 수 없습니다."));
        return selected;
    }

    @Override
    public Product updateProductName(Long number, String name) throws Exception {
        Optional<Product> selected = productRepository.findById(number);

        Product updatedProduct;
        if (selected.isPresent()) {

            Product updateItem = selected.get();

            updateItem.setName(name);
            updateItem.setUpdateAt(LocalDateTime.now());

            updatedProduct = productRepository.save(updateItem);
        } else {
            throw new Exception("선택된 항목을 변경할 수 없습니다.");
        }

        return updatedProduct;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {
        Optional<Product> selected = productRepository.findById(number);
        if (selected.isPresent()) {
            Product deleteItem = selected.get();

            productRepository.delete(deleteItem);
        } else {
            throw new Exception("선택된 항목을 삭제할 수 없습니다.");
        }

    }
}
