package com.szczerbiak.words.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by piotr.szczerbiak on 05.07.2017.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String mainPage (){
        return "index";
    }
}
