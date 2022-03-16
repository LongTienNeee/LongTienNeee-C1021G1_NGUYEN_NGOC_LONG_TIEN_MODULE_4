package com.longtien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SmartPhoneController {
    @Autowired
    private

    @GetMapping("/home")
    public String gotoHomePage(){
        return "/phone";
    }
}
