package com.longtien.customervalidation.controller;

import com.longtien.customervalidation.dto.PhoneNumberDto;
import com.longtien.customervalidation.model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class NumberPhoneController {
    @GetMapping("")
    public ModelAndView getHome(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("phoneNumberDto", new PhoneNumberDto());
        return modelAndView;
    }

    @PostMapping("/validate")
    public String checkValidation (@Valid @ModelAttribute("phoneNumberDto") PhoneNumberDto phoneNumberDto, BindingResult bindingResult, Model model){
        new PhoneNumberDto().validate(phoneNumberDto, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "/home";
        }
        else {
            model.addAttribute("phoneNumberDto", phoneNumberDto);
            return "/result";
        }
    }

}
