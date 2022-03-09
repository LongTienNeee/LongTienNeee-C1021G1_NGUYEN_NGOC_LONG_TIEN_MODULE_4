package com.longtien.controller;

import com.longtien.model.Blog;
import com.longtien.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/blog")
    public ModelAndView showHome(){
        List<Blog> blogList = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/Home");
        modelAndView.addObject("blogs", blogList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog" , new Blog());
        return modelAndView;
    }

    @PostMapping  ("create")
    public String createBlog(Blog blog){
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable long id){
        Blog blog = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("blog/delete");
        modelAndView.addObject( "blog" , blog);
        return modelAndView;
    }

    @PostMapping("/delete")
    public String deleteBlog(long id){
        blogService.delete(id);
        return "redirect:/blog";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable long id){
        Blog blog = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/edit-blog")
    public String editBlog(long id){
        Blog blog = blogService.findById(id);
        blogService.save(blog);
        return "redirect:/blog";
    }
}
