package com.springboot.jpa.service;

import com.springboot.jpa.data.dto.ProductDTO;
import com.springboot.jpa.data.dto.ProductResponseDTO;

public interface ProductService {

    ProductResponseDTO getProduct(Long number);

    ProductResponseDTO saveProduct(ProductDTO product);

    ProductResponseDTO changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
