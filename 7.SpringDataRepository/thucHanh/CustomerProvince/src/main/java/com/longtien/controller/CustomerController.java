package com.longtien.controller;

import com.longtien.model.Customer;
import com.longtien.model.Province;
import com.longtien.repository.ICustomerRepository;
import com.longtien.service.customer.ICustomerService;
import com.longtien.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping("/customer")
    public ModelAndView showHomeCustomer(){
        ModelAndView modelAndView = new ModelAndView("customer/home");
        modelAndView.addObject("customer",customerService.findAll());
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateCustomerPage(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public String CreateNewCustomer(@RequestAttribute  Customer customer,Model model){
        customerService.save(customer);
        model.addAttribute("customer", new Customer());
        return "redirect:/customer";
    }
}
