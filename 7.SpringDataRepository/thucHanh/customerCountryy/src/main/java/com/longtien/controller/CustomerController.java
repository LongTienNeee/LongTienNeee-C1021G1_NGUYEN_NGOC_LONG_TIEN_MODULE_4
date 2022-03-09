package com.longtien.controller;

import com.longtien.model.Customer;
import com.longtien.serivce.country.ICountryService;
import com.longtien.serivce.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    private ICountryService countryService;

    @GetMapping("")
    public ModelAndView getCustomerHome(){
        Iterable<Customer> customerList = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("customers", customerList);
        modelAndView.addObject("country",countryService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCustomer (@ModelAttribute Customer customer){
        customerService.save(customer);
        return "redirect:/";
    }

}
