package springmvc02.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String homepage() {
		
		return "Home";
	}
	
	@RequestMapping("/about")
	public String aboutpage(Model mod) {
		
		mod.addAttribute("name", "Shilpa");
		mod.addAttribute("id", 786454);
		return "about";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView  modelAndView = new ModelAndView();
		
		modelAndView.addObject("name", "Wasim");
		
		List<Integer>  l = new ArrayList<Integer>();
		l.add(23);
		l.add(90);
		l.add(65);
		modelAndView.addObject("l", l);
		
		//for setting page which page
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
