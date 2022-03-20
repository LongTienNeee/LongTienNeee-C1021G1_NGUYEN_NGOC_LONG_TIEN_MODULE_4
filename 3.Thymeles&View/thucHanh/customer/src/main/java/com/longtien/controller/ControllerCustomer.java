package com.longtien.controller;

import com.longtien.model.Customer;
import com.longtien.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ControllerCustomer {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public String gotoCustomerPage(Model model){
        model.addAttribute("customer", customerService.findAll());
        return "home";
    }

    @GetMapping("/create")
    public ModelAndView gotoCreateCustomerPage(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject( "customer" , new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String CreateNewCustomer(Customer customer, Model model){
        customerService.save(customer);
        model.addAttribute("customer", new Customer());
        return "redirect:/customer";
    }

    @GetMapping("delete/{id}")
    public ModelAndView gotoDeletePage(@PathVariable long id) {
        Optional<Customer> customer = customerService.findById(id) ;
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("customers", customer.get());
        return modelAndView;
    }

    @PostMapping("/delete")
    public String deleteCustomer(Customer customer){
        customerService.delete(customer);
        return "redirect:/customer";
    }

    @GetMapping("edit/{id}")
    public ModelAndView gotoEditPage(@PathVariable long id) {
        Optional<Customer> customer = customerService.findById(id) ;
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("customers", customer.get());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editCustomer(Customer customer){
        customerService.save(customer);
        return "redirect:/customer";
    }


}
