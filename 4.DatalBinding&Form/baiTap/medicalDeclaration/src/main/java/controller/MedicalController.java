package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicalController {

    @GetMapping("/medicalForm")
    public String getMedicalForm(){
        return "medicalForm";
    }
}
