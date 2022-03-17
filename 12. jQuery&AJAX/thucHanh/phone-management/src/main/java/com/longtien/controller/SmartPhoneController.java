package com.longtien.controller;

import com.longtien.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SmartPhoneController {
    @Autowired
    private ISmartphoneService service;

    @GetMapping("/home")
    public String gotoHomePage(){
        return "/phone";
    }
}
