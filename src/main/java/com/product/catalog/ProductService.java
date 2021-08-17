package com.product.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAllProducts(){

        return productRepository.findAll();
    }

    public String saveProduct(Product product){

        productRepository.save(product);
        return "product added successfully";
    }

    public Optional<Product> getProductById(String id){

        return productRepository.findById(Long.parseLong(id));
    }


    public String deleteProductById(String id){

        productRepository.deleteById(Long.parseLong(id));
        return "product deleted successfully";
    }

}
