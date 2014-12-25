package com.test.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("message", "Hi user, is logged in");
        return modelAndView;
    }

    @RequestMapping(value = "/chart")
    public ModelAndView loadChart() {
        ModelAndView modelAndView = new ModelAndView("chart");
        System.out.println("Loading chart Page ===>");
        modelAndView.addObject("message", "Hi user, is logged in");
        return modelAndView;
    }

    @RequestMapping(value = "/testChart")
    public String loadTestChart() {
        return "testChart";
    }

    @RequestMapping(value = "/jsonChart")
    public String loadJsonChart() {
        return "jsonChart";
    }

}
