package com.javasampleapproach.wardeployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping(value={"/helloworld"})
    public String home(){
        return "home";
    }
}