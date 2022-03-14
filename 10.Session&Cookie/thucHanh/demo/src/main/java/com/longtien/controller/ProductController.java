package com.longtien.controller;

import com.longtien.model.Cart;
import com.longtien.model.Product;
import com.longtien.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart initCartForm(){
        return new Cart();
    }

    @GetMapping("/yobato")
    public ModelAndView showYobatoShop(){
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("product", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart , @RequestParam("action") String action){
        Optional<Product> productOptional = productService.findById(id);
        if(!productOptional.isPresent()){
            return "/error.404";
        }
        if(action.equals("show")){
            cart.addProduct(productOptional.get());
            return "/shop";
        }
        cart.addProduct(productOptional.get());
        return "/shop";
    }
}
