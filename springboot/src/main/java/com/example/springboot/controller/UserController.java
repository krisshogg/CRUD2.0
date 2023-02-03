package com.example.springboot.controller;


import com.example.springboot.model.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


//import web.model.User;
//import web.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("users", userService.index());
        return "index";
    }

    @GetMapping( "/{id}")
    public String show(@PathVariable("id") int id, Model model) {

        model.addAttribute("user", userService.show(id));
        return "show";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        return "new";
    }

/*    @PostMapping()
    public String create(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "new";
        }

        userService.save(user);
        return "redirect:/";
    }*/

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userService.show(id));
        return "edit";
    }

/*    @PostMapping("/{id}")
    public String update( @PathVariable("id") int id, Model model) {
        User user = userService.index();
        model.addAttribute("user", user);
        return "redirect:/";
    }*/

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/";
    }

}
