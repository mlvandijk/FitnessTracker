package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping(value="/addMinutes")
    public String addMinutes(){
        return "addMinutes";
    }
}
