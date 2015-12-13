package com.example.nitin;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    public ApplicationController() {
        super();
    }

    @RequestMapping("/")
    public ModelAndView root() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome(Model model, HttpServletRequest request) throws IllegalAccessException {
        LOGGER.info("Expecting model is {} and request is {}", model, request);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", "Nitin");
        mv.setViewName("welcome");
        return mv;
    }

}
