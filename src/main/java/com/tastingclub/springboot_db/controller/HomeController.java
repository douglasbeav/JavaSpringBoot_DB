package com.tastingclub.springboot_db.controller;

import com.tastingclub.springboot_db.model.User;
import com.tastingclub.springboot_db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        List<User> userList = userService.fetchAll();
        model.addAttribute("users", userList);
        return "home/index";
    }

    @GetMapping("/addUser")
    public String add_User() { return "home/addUser"; }

    /*@PostMapping("/addUser")
    public String addUser(@ModelAttribute User user) {

    }*/


}
