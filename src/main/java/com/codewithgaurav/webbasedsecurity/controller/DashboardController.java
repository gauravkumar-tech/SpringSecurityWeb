package com.codewithgaurav.webbasedsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dash")
    public String dashboard() {
        return "dashboard";
    }

}
