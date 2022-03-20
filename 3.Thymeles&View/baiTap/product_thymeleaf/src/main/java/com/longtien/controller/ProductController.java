package com.longtien.controller;

import com.longtien.model.Product;
import com.longtien.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/product")
    public ModelAndView gotoCustomerPage(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("product", productService.findAll());
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView gotoCreatePage(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createNewProduct( Product product){
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView gotoDeletePage(@PathVariable Long id){
        Optional<Product> product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("product", product.get());
        return modelAndView;
    }

    @PostMapping("/delete")
    public String deleteProduct(Product product){
        productService.delete(product);
        return "redirect:/product";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView gotoEditPage(@PathVariable Long id){
        Optional<Product> product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("product", product.get() );
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editProduct( Product product){
        productService.save(product);
        return "redirect:/product";
    }

}
