package com.ecom.ecom_api.repo;


import com.ecom.ecom_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Integer> {



    List<Product> findByCategoryIgnoreCase(String category);
}
