package springmvc02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc02.user.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
	
	
	@RequestMapping(path="/formSubmit", method=RequestMethod.POST)
	public String handleForm(Model model  ,
			@RequestParam("userId") Integer userId,
			@RequestParam("userName") String userName ,
			@RequestParam("userEmail") String userEmail,
			@RequestParam("userPasswd") String userPasswd  ){
		
		
		 System.out.println(userName+" "+userEmail+" "+userPasswd);
		
		   model.addAttribute("userId", userId);
		   model.addAttribute("userName", userName);
		   model.addAttribute("umail", userEmail);
		   model.addAttribute("userpass", userPasswd);
		   
//		   User user = new User();
//		   user.setName(userName);
//		   user.setEmail(userEmail);
//		   user.setPass(userPasswd);
//		   
//		   model.addAttribute("user", user);
//		
		
		return "spring";
	}

}
