package com.longtien.controller;

import com.longtien.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView gotoLoginPage(){
        ModelAndView modelAndView = new ModelAndView("/loginPage");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/login")
    public String Login(User user , Model model){
        model.addAttribute("user", user);
                return "/result";
    }
}
