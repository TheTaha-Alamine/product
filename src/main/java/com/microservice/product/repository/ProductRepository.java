package com.microservice.product.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public String findProductByBaseProductNo(String baseProductNo){
        if(baseProductNo.isBlank()) return null;

        try {
            String product = jdbcTemplate.
                    queryForObject("select document from base_product where document ->> 'base_product_no' == :base_Product_No",
                    Map.of("base_product_no", List.of(baseProductNo)),
                    String.class);
            return product;
        } catch (DataAccessException e) {
            logger.warn("smth went wrong probably u should try with another baseProductNo");
            throw e;
        }
    }
}
