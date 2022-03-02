package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {

    @GetMapping("/sandwich")
    public String getSandWich() {
        return "sandwich";
    }

    @RequestMapping("/save")
    public ModelAndView save(@RequestParam(defaultValue = "Không có topping") String[] condiment, Model model) {
            ModelAndView modelAndView = new ModelAndView("result", "message", condiment);
                return modelAndView;
        }
    }
