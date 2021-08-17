package com.product.catalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc

public class ProductServiceTest {

    @Autowired
    private MockMvc mockMvc;



    @Test
    @Order
    void listAllProducts() {
    }

    @Test
    void saveProduct() {
    }

    @Test
    void getProductById() {
    }

    @Test
    void deleteProductById() {
    }
}