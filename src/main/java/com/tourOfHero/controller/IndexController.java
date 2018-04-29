package com.tourOfHero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yeo-sglo on 20/03/17.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "redirect:/hero/list";
    }
}
