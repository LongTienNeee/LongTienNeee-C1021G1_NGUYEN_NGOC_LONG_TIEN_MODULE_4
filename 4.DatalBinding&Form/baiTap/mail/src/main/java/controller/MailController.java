package controller;

import model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MailController {

    @RequestMapping(value = "mailForm", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("mail", new Mail());
        return "mailForm";
    }
}
