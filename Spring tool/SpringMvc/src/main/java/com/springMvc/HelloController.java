package com.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//@RestController
@Controller
public class HelloController {
    @RequestMapping("/name")
    public String sayname() {
        return "name";

    }

    @RequestMapping("/city")
    @ResponseBody
    public String saycity() {
        return "city";

    }
    @RequestMapping("/movie")
    public ModelAndView getMovies() {
        ModelAndView mv=new ModelAndView();

        mv.addObject("movieName","bahubali");
        mv.addObject("movieActor","Prabhas");

        mv.setViewName("mov");
        return mv;
    }
  
}
