package com.microservice.product.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

public class Product {

    int baseProductNo;
    ProductName name;
    ProductStatus status;
    ZonedDateTime created;
}

class ProductName{
    @JsonProperty("short")
    String nameShort;
    @JsonProperty("long")
    String nameLong;
}

enum ProductStatus{
    SELLABLE, SOLDOUT, UNPREPARED
}




