package com.longtien.controller;
import com.longtien.service.blog.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping
    public ModelAndView gotoBlogPage(){
        ModelAndView modelAndView = new ModelAndView("/blog/home");
        modelAndView.addObject("blog", blogService.findAll());
        return modelAndView;
    }
}
