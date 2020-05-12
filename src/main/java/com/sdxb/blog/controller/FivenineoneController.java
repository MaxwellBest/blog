package com.sdxb.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class FivenineoneController {

    @GetMapping("/fno")
    public String greeting(@RequestParam(value="title", required=false, defaultValue="xiao") String title, Model model) {
        //model.addAttribute("name", title);
        return "fno";
    }

}
