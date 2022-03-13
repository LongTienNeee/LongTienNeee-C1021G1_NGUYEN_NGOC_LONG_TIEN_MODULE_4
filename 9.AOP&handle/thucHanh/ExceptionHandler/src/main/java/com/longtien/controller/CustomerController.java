package com.longtien.controller;

import com.longtien.exception.DuplicateEmailException;
import com.longtien.model.Customer;
import com.longtien.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public ModelAndView showList(){
        List<Customer> customerList = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/customer", "customer", customerList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateCustomerPage(){
        ModelAndView modelAndView = new ModelAndView("customer/create", "customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createCustomer(@RequestAttribute("customer") Customer customer) throws DuplicateEmailException{
        try {
            customerService.save(customer);
            return new ModelAndView("redirect:/customer");
        } catch (DuplicateEmailException e) {
            return new ModelAndView("/customer/error");
        }
    }
}
