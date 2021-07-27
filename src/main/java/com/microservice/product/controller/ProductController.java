package com.microservice.product.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microservice.product.domain.Product;
import com.microservice.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{productNo}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Product> getProductDetails(@PathVariable String productNo) throws JsonProcessingException {
        Product product = productService.findByBaseProductNo(productNo);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(product);
    }


}
