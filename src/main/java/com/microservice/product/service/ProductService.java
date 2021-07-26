package com.microservice.product.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice.product.domain.Product;
import com.microservice.product.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private ObjectMapper objectMapper;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public Product findByBaseProductNo(String baseProductNo) throws JsonProcessingException {
        logger.info("getting product details of product :"+baseProductNo);
        try{
            String productJson = productRepository.findProductByBaseProductNo(baseProductNo);
            return objectMapper.readValue(productJson, Product.class);
        }
        catch(Exception e){
            logger.error("smth went wrong!!");
            throw e;
        }
    }
}
