package controller;

import model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {

    @RequestMapping(value = "mailForm", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("mail", new Mail());
        return "mailForm";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("mail") Mail mail ,Model model){
        model.addAttribute("language", mail.getLanguage());
        model.addAttribute("pageSize", mail.getPageSize());
        model.addAttribute("spamsFilter", mail.isSpamsFilter());
        model.addAttribute("signature", mail.getSignature());
        return "showMail";

}

}
