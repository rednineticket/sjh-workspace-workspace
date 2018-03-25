package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController 
{
	@GetMapping("/helloworld")
	public String welcome(String name, int age, Model model)  // localhost:8080/helloworld?name=john&age=12
	{
		System.out.println("name: " + name);
		model.addAttribute("hehe", name);   //hehe - mustache name in html  //name=john <=url id
		                                    
		model.addAttribute("age", age);
		return "welcome";
	}
}
