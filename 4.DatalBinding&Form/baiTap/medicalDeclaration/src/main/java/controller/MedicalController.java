package controller;

import model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MedicalController {

    @GetMapping("/medicalForm")
    public String getMedicalForm(){
        return "medicalForm";
    }

    @PostMapping("/save")
    public String ApplyForm(@RequestParam("form") Patient patient ,Model model){
        return "informationPatient";
    }
}
