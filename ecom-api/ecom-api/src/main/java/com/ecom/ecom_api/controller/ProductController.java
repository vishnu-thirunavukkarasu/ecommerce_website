package com.ecom.ecom_api.controller;

import com.ecom.ecom_api.model.Product;
import com.ecom.ecom_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    public ProductService service;

    @GetMapping("/test")
    public String HealthCheck(){

        return "Server is running";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct(){

        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{category}")
    public ResponseEntity<List<Product>> getProductByCategory(@PathVariable String category){

        List<Product> product=service.getProductByCategory(category);

        if(product !=null)
            return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
