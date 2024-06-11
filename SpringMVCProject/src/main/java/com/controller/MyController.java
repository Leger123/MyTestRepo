package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");
		return mv;
	}
	
	@RequestMapping("hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		mv.addObject("name", "Kevin");
		mv.addObject("email", "kevin@gmail.com");
		mv.addObject("salary", 55000);
		return mv;
	}
	
	@RequestMapping("calc")
	public ModelAndView findAddition(@ModelAttribute("calc") Calc calc) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Addition");
		int sum = calc.getN1() + calc.getN2();
		mv.addObject("sum", sum);
		return mv;
	}
	
	@RequestMapping("employee")
	public ModelAndView createEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Send Employee Details");
		mv.addObject("employee", employee);
		return mv;
	}
}
