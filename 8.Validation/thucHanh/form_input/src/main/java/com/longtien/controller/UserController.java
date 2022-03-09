package com.longtien.controller;

import dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("")
    public String showFormLogin(Model model){
        model.addAttribute("userDto", new UserDTO());
        return "user/home";
    }

    @PostMapping ("/login")
    public String checkValidate(@Validated @ModelAttribute("userDto") UserDTO userDTO,
                                BindingResult bindingResult,
                                Model model){
        if(bindingResult.hasFieldErrors()){
            return "user/home";
        } else {
            return "user/result";
        }

    }

}
