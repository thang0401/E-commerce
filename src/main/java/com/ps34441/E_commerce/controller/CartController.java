package com.ps34441.E_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    @GetMapping("/cart/checkout")
    public String GetAllProduct(){
        return "cart/checkout";
    }
    @GetMapping("/cart/view")
    public String GetDetail(){
        return "cart/view";
    }
    @GetMapping("/cart/view1")
    public String GetDetail1(){
        return "cart/view";
    }
}
