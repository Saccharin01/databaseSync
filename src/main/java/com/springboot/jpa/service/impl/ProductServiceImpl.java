package com.springboot.jpa.service.impl;

import com.springboot.jpa.data.dao.ProductDAO;
import com.springboot.jpa.data.dto.ProductDTO;
import com.springboot.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.jpa.data.dto.ProductResponseDTO;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public ProductResponseDTO getProduct(Long number){
        return null;
    }

    @Override
    public ProductResponseDTO saveProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductResponseDTO changeProductName(Long number, String productName) throws Exception {
        return null;
    }

    @Override
    public void deleteProduct(Long number) {

    }
}
