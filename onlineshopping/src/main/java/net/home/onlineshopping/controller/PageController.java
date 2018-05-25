package net.home.onlineshopping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class PageController {
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView doView(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings","Hello World!");
		return mv;
	}

}
