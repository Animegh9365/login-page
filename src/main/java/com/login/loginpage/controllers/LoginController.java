package com.login.loginpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class LoginController {

    @GetMapping("/")
    public String homePage() {
        return "homepage";
    }
    
    
    @RequestMapping(value = "/login", method=RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
    
    @RequestMapping(value = "/login", method=RequestMethod.POST)
    public String welcomePage(ModelMap model ,@RequestParam String userid,@RequestParam String password) {

        if (userid.equals("admin") && password.equals("admin")) {
            return "welcome";
        }
        model.put("errorMsg", "Please provide correct credentials");

        return "login";
    }
}
