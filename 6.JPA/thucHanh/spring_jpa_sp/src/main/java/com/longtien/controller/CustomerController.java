package com.longtien.controller;

import com.longtien.model.Customer;
import com.longtien.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public ModelAndView showHomePage(){
       List<Customer> customerList =  customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customerList);
        return  modelAndView;

    }

    @GetMapping("/create")
    public ModelAndView showCreatePage(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customers", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveCustomer(@ModelAttribute("customers") Customer customer) {
        customerService.insertWithStoredProcedure(customer);
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }
}
