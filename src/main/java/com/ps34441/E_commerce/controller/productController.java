package com.ps34441.E_commerce.controller;

import com.ps34441.E_commerce.entity.Product;
import com.ps34441.E_commerce.repository.CategoryRepository;
import com.ps34441.E_commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class productController {
    @Autowired
    ProductRepository productRepository;
    CategoryRepository categoryRepository;


    @GetMapping("/product/list")
    public String getAllProducts(Model model, @RequestParam("cid") Optional<String> cid) {
        List<Product> productList;

        if (cid.isPresent() && !cid.get().isEmpty()) {
            try {
                // Convert category ID to Integer if necessary
                Integer categoryId = Integer.parseInt(cid.get());
                productList = productRepository.findByCategoryId(categoryId);
            } catch (NumberFormatException e) {
                // Handle invalid category ID (non-numeric)
                model.addAttribute("error", "Invalid category ID provided.");
                productList = productRepository.findAll();
            }
        } else {
            // Fetch all products if no category ID is provided
            productList = productRepository.findAll();
        }

        model.addAttribute("productList", productList);
        return "product/list"; // Return the view name
    }


    @GetMapping("/product/detail/{id}")
    public String GetDetail(Model model, @PathVariable("id") Integer id){
        Product product = productRepository.findById(id).get();
        model.addAttribute("product", product);
        return "product/detail";
    }

}
