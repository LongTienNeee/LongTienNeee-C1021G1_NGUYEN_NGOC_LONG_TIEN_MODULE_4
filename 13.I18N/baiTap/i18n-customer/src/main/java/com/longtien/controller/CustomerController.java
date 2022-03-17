package com.longtien.controller;

import com.longtien.model.Customer;
import com.longtien.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public ModelAndView gotoCustomerPage() {
        ModelAndView modelAndView = new ModelAndView("/customer/home");
        modelAndView.addObject("customer", customerService.findAll());
        return modelAndView;
    }

    @GetMapping("/link")
    public String gotoLink(){
        return "redirect:https://songkhoemoingay.com/nhung-loi-chuc-suc-khoe-cho-nguoi-benh/";
    }

}
