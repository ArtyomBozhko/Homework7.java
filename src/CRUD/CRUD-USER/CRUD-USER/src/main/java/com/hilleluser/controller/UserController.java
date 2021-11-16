/*package com.hilleluser.controller;

import com.hilleluser.domain.User;
import com.hilleluser.domain.UserRepositori;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    UserRepositori userRepositori;
    public UserController(UserRepositori userRepositori)
    {
        this.userRepositori = userRepositori;
    }


    @GetMapping("/users/add")
    public String userForm(User user) {
    return "add-user";
    }

    @PostMapping
    public String addUser(@Valid User user, BindingResult result, Model model) {
        if(result.hasErrors())
        {
            return "add-users";
        }
        userRepositori.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users")
    public String getUsers(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }
}
*

 */