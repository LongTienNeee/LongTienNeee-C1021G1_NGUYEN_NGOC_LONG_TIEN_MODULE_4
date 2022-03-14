package com.longtien.controller;

import com.longtien.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("longtien")
public class CounterController {

    //Tạo 1 đối tượng counter Rỗng ngay khi vào controller
    @ModelAttribute("longtien")
    public Counter setUpCounter(){
        return new Counter();
    }

    @GetMapping("/count")
    public ModelAndView goToCountPage(@ModelAttribute("longtien") Counter counter){
        ModelAndView modelAndView = new ModelAndView("/counter/count");
        counter.incrementCount();
        return modelAndView;
    }
}