package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;

@Controller
public class DictionaryController {

    @GetMapping("/dictionary")
    public String index() {
        return "home";
    }

    @PostMapping("/word")
    public String dictionary(@RequestParam String word , Model model){
        if(word == )


    }
}
