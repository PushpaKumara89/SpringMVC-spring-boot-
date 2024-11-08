package com.appk.springmvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    /*@RequestMapping("add")
    public String add(HttpServletRequest req){
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int sum = i+j;
        HttpSession session = req.getSession();

        session.setAttribute("sum", sum);
        return "result.jsp";
    }*/

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j){
        int sum = i+j;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");
        mv.addObject("sum", sum);

        return mv;
    }
}
