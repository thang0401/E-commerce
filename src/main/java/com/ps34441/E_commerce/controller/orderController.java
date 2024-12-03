package com.ps34441.E_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class orderController {
    @GetMapping("/order/list")
    public String GetAllProduct(){
        return "order/list";
    }
    @GetMapping("/order/detail/{id}")
    public String GetDetail(){
        return "order/detail";
    }
}
