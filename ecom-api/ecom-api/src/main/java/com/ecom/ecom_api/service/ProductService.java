package com.ecom.ecom_api.service;


import com.ecom.ecom_api.model.Product;
import com.ecom.ecom_api.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

        @Autowired
        private ProductRepo repo;


        public List<Product> getAllProducts(){

            return repo.findAll();
        }

        public List<Product> getProductByCategory(String category){

            return repo.findByCategoryIgnoreCase(category);

        }
}
