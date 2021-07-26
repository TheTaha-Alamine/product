package com.microservice.product.domain;

public class Variant {
    private String sku;
    private ProductStatus status;
    private String price;

    public String getSku() {
        return sku;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public String getPrice() {
        return price;
    }
}
