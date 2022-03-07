package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.ICustomer;
import service.impl.CustomerImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    private static  final ICustomer customerService = new CustomerImpl();

    @GetMapping("/customer")
    public ModelAndView getCustomerPage(){
        List<Customer> customerList = customerService.getAllCustomer();
        ModelAndView modelAndView = new ModelAndView("index", "customerList", customerList);
        return modelAndView;
    }
}
