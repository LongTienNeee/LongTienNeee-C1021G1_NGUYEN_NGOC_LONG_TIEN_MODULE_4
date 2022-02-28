package controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeMoneyController {
        @GetMapping("/")
        public String index(){
            return "index";
        }


   @PostMapping("/usd")
    public String submit(@RequestParam String usd , String rate , Model model){
            double USD = Double.parseDouble(usd);
            double RATE = Double.parseDouble(rate);
            double result = USD * RATE;
            model.addAttribute("result" , result);
            model.addAttribute("usd" , USD);
            return "submit";
   }
}
