package com.wzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wei
 * @Date 2021/8/4
 */
@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("mess", "Hello SpringBoot!");
        return  modelAndView;
    }
}
