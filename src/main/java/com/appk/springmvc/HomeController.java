package com.appk.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

   /* @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m){
        int sum = i+j;
        m.addAttribute("sum", sum);
        return "result";
    }*/
    @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m){
        int sum = i+j;
        m.addAttribute("sum", sum);
        return "result";
    }
}

// Model and ModelMap