package com.product.catalog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    public ProductService productService;

    @PostMapping("/product")
    public String addProduct(@RequestBody Product product) {

        return  productService.saveProduct(product);

    }
    @GetMapping("/product/{id}")
    public Optional<Product> getProductDetails(@PathVariable String id) {

        return productService.getProductById(id);
    }
    @GetMapping("/products")
    public List < Product > getProductList() {

        return productService.listAllProducts();
    }

    @PutMapping("/product")
    public String updateProduct(@RequestBody Product product) {

        return  productService.saveProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable String id) {

        return productService.deleteProductById(id);
    }

}
