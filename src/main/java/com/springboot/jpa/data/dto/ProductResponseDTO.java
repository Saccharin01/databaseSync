package com.springboot.jpa.data.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private Long number;
    private String name;
    private int price;
    private int stock;

    public ProductResponseDTO() {}

    public ProductResponseDTO(Long number, String name, int price, int stock) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
