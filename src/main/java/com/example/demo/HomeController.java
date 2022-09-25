package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("message","model을 이용해서 나온 글자 => hello.jsp입니다. ");
		return "hello";
	}
	
	
//	@RequestMapping("/")
//	public String hello(Model model) {
//		model.addAttribute("message", "hello.jsp");
//		return "hello";
//	}
	
	
	
//	@GetMapping("/hello")
//	public String hello(Model model) {
//		model.addAttribute("message", "hello.jsp");
//		return "hello";
//	} 
	
	
	
	
	
}
