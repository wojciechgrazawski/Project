/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project.controllers;

import com.mycompany.project.entities.User;
import com.mycompany.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author wojciech
 */
@Controller
public class ProjectController {

    private final UserService userService;


    @Autowired
    public ProjectController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/index")
   public String index() {

       return "index";
    }

    @RequestMapping("/singup")
    public String singup(Model model) {
        model.addAttribute("user", new  User());
        return "singup";
    }

    @RequestMapping("/loginform")
    public String login(Model model) {
        model.addAttribute("user", new  User());
        return "login";
    }

    @RequestMapping("/createaccount")
    public String createaccount(@ModelAttribute("user") User user,BindingResult result, Model model) {
        model.addAttribute("user", user);
        if(!userService.findUser(user)) {
            userService.saveUser(user);
            return "logged";
        }
        else {
            return "signuperror";
        }

    }

    @RequestMapping("/login")
    public String login(@ModelAttribute("user") User user,BindingResult result, Model model) {
        model.addAttribute("user", user);
        if(userService.checkLoginUser(user)) {
            return "logged";
        }
        else {
            return "loginerror";
        }

    }

    @RequestMapping("/changepasswordform/{user.email}")
    private String changepassword(@PathVariable(value = "user.email") String email, Model model) {
        User user = new User();
        user.setEmail(email);
        model.addAttribute("user",user);
        return "changepassword";
    }

    @RequestMapping("/changepasswordform/change")
    private String change(@RequestParam("oldpassword") String oldpassword,@RequestParam("newpassword") String newpassword,@RequestParam("email") String email, Model model) {
        if(userService.changeUserPassword(email,oldpassword,newpassword)) {
            return "successpasswordchange";
        } else {
            return "unsuccesspasswordchange";
        }
    }

    @RequestMapping("/userdetails/{user.email}")
    private String userdetails(@PathVariable(value = "user.email") String email, Model model) {
        User user = new User();
        user.setEmail(email);
        model.addAttribute("user",user);
        return "cgsdf";
    }


    
}
