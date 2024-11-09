package com.appk.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @ModelAttribute
    public void modelData(Model m){
        m.addAttribute("name", "Alien");
    }
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m){
        int sum = i+j;
        m.addAttribute("sum", sum);
        return "result";
    }

    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute Alien a){

        return "result";
    }

    @GetMapping("getAliens")
    public String getAliens(Model m){
        List<Alien> aliens = Arrays.asList(
                new Alien(101, "Navin"), new Alien(102, "Kavin")
        );
        m.addAttribute("Aliens", aliens);
        return "showAliens";
    }
}

// ModelAttribute       02.48.02