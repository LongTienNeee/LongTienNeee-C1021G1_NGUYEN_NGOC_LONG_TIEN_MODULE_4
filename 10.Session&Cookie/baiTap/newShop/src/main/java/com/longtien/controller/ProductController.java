package com.longtien.controller;


import com.longtien.model.Product;
import com.longtien.service.IProductService;
import com.longtien.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart,  @RequestParam("action") String action ){
        Optional<Product> productOptional = productService.findById(id);
        if(!productOptional.isPresent()){
            return "/error.404";
        }
        if(action.equals("show")){
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
//        if(action.equals("in4")){
//            cart.addProduct(productOptional.get());
//            return "redirect:/show-in4";
//        }
        cart.addProduct(productOptional.get());
        return "redirect:/yobato";
    }

    @GetMapping("/show-in4/{id}")
    public String showIn4(@PathVariable Long id , Model model){
        Optional<Product> product = productService.findById(id);
        if (product.isPresent()){
            Product product1 = product.get();
            model.addAttribute("products", product1);
        }

        return "showIn4";
    }
}
