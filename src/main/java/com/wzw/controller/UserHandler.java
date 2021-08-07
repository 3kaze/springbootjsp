package com.wzw.controller;

import com.wzw.entity.User;
import com.wzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * @author wei
 * @Date 2021/8/4
 */
@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService usersService;

    @GetMapping("/findAll")
    public ModelAndView find() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", usersService.findAll());
        return modelAndView;
    }

    @GetMapping("findById/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id ){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("user", usersService.findById(id));
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(User user) {
        usersService.save(user);
        return "redirect:/user/findAll";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        usersService.deleteById(id);
        return "redirect:/user/findAll";
    }

    @PostMapping("/update")
    public String update(User user) {
        usersService.update(user);
        return "redirect:/user/findAll";
    }
}
