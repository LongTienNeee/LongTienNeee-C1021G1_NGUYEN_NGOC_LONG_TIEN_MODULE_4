package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String getCaculatorPage() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("value1") double value1,
                            @RequestParam("value2") double value2,
                            @RequestParam("button") String button,
                            Model model){
//        System.out.println(value1);
//        System.out.println(value2);
//        System.out.println(button);
    double result = 0;
        switch (button){
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                if(value2 == 0){
                    model.addAttribute("error", "Lỗi : Không chia được cho số không");
                } else {
                    result = value1 / value2;
                }
                break;
        }

    model.addAttribute("result", result);
return "calculator";
    }

}
