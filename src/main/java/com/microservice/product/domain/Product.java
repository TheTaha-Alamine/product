package com.microservice.product.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;
import java.util.List;

public class Product {

    String baseProductNo;
    ProductName name;
    ProductStatus status;
    List<Variant> variants;
    ZonedDateTime created;

    public String getBaseProductNo() {
        return baseProductNo;
    }

    public ProductName getName() {
        return name;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public ZonedDateTime getCreated() {
        return created;
    }
}

class ProductName{
    @JsonProperty("short")
    String nameShort;
    @JsonProperty("long")
    String nameLong;

    public String getNameShort() {
        return nameShort;
    }

    public String getNameLong() {
        return nameLong;
    }
}

enum ProductStatus{
    SELLABLE, SOLDOUT, UNPREPARED
}




