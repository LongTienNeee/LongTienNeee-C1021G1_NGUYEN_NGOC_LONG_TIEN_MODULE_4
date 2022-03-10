package com.longtien.controller;

import com.longtien.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/create")
    public String showCreatePage(Model model){
        model.addAttribute("userDto", new UserDto());
        return "/create";
    }

    @PostMapping("/create")
    public String createUser(@Validated @ModelAttribute("userDto") UserDto userDto,
                             BindingResult bindingResult , Model model){
//        new UserDto().validate(userDto,bindingResult);
        if(bindingResult.hasFieldErrors()){
            return "/create";
        } else {
            model.addAttribute("userDto", userDto);
            return "/complete";
        }

    }
}
