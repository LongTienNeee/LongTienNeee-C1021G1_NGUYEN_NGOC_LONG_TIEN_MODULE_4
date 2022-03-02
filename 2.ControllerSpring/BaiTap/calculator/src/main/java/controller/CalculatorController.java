package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ICalculator;
import service.impl.CalculatorImpl;

import java.util.regex.Matcher;

@Controller
public class CalculatorController {
    private static ICalculator calculator = new CalculatorImpl();

    @GetMapping("/calculator")
    public String getCaculatorPage() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam double value1,
                            @RequestParam double value2,
                            @RequestParam String button,
                            Model model){

    double result = 0;
        switch (button){
            case "+":
                result = calculator.add(value1,value2);
                break;
            case "-":
                result = calculator.sub(value1,value2);
                break;
            case "*":
                result = calculator.mul(value1,value2);
                break;
            case "/":
                if(value2 == 0){
                    model.addAttribute("error", "Lỗi : Không chia được cho số không");
                } else {
                    result = calculator.div(value1,value2);
                }
                break;
        }

    model.addAttribute("result", result);
return "calculator";
    }

}
