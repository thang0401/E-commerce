package com.ps34441.E_commerce.repository;

import com.ps34441.E_commerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
