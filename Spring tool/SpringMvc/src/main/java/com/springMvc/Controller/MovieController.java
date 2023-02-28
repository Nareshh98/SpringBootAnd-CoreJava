package com.springMvc.Controller;

import java.util.ArrayList;
import java.util.List; 
  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springMvc.model.Movie; 
  
 
  
@Controller
public class MovieController {



    List<Movie> movies=new ArrayList<Movie>();

    @RequestMapping("/movies")
    public ModelAndView getMovies() {

        ModelAndView mv=new ModelAndView();

        Movie m=new Movie("topGun","tom ");
        Movie m1=new Movie("spiderman","naresh");
        Movie m2=new Movie("avatar","tom ");
        Movie m3=new Movie("titanic","tom ");


        movies.add(m);
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        mv.addObject("movies",movies);
        mv.setViewName("naresh");

        return mv;

    }
  
}
