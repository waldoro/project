package com.waldoro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wrokita on 27/11/2016.
 */
@Controller
public class MainController {

    @RequestMapping("/hello")
    public String homepage()
    {
        return "helloworld";
    }
}
