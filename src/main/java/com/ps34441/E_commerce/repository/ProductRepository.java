package com.ps34441.E_commerce.repository;

import com.ps34441.E_commerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
//    Product  findAllById(Integer id);
@Query("select p from Product p where p.category.id = :cid") // Use your actual entity name and relationship field.
List<Product> findByCategoryId(@Param("cid") Integer cid);

}
