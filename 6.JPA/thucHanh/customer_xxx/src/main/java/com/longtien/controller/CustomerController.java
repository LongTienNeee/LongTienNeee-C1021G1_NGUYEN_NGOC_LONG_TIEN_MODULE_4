package com.longtien.controller;

import com.longtien.model.Customer;
import com.longtien.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public ModelAndView showListCustomer(){
        List<Customer> customerList = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customer", customerList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createNewCustomer(Customer customer, Model model){
        customerService.save(customer);
//        ModelAndView modelAndView = new ModelAndView("customer/list");
        model.addAttribute("customer" , new Customer());
//        modelAndView.addObject("message", "Thêm thành công 1 khách hàng");
        return "redirect:/customer";
    }

    @GetMapping("/delete")
    public ModelAndView showDeleteForm(@PathVariable long id){
        Customer customer = customerService.findById(id);
            ModelAndView modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;
        }


    @PostMapping("/delete")
    public ModelAndView deleteCustomer(@RequestParam("customer") Customer customer){
        return null;
    }
}
