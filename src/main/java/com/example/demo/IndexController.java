package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping(value="/num", method=RequestMethod.GET)
	public ModelAndView indexGET(ModelAndView mv) {
		mv.addObject("num", "半角で入力");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="/num", method=RequestMethod.POST)
	public ModelAndView indexPOST(ModelAndView mv, @RequestParam("numVal")String num) {
	  mv.addObject("num", num);
	  mv.setViewName("index");
	  return mv;
	}

}