package com.longtien.controller;

import com.longtien.model.Province;
import com.longtien.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private IProvinceService provinceService;

    @GetMapping
    public ModelAndView showHomeProvince(){
        ModelAndView modelAndView = new ModelAndView("/province/home");
        modelAndView.addObject("province", provinceService.findAll());
        return modelAndView;
    }

    @PostMapping
    private String createProvince(@RequestAttribute("province")Province province, Model model) {
       provinceService.create(province);
       return "/province";

    }
}
