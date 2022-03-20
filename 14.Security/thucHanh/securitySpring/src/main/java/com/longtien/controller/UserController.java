package com.longtien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
    @GetMapping("/home")
    public String gotoYoutube(){
        return "redirect:https://www.facebook.com/hun.man.330";
    }
}
