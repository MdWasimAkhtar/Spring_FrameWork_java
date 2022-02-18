package springMVCApp02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVCApp02.Client.User;
import springMVCApp02.userService.UserService;


@Controller
public class HomeController {
	
	@Autowired
	private UserService usrService;
	
	@ModelAttribute
	public String homepage() {
		System.out.println("Home Page");
		return "success";
	}
	

	@RequestMapping("/home")
	public String formpage() {
		System.out.println("Home Page");
		return "form";
	}
	
	
	@RequestMapping(path="/form1", method= RequestMethod.POST)
	public String formHandler(@ModelAttribute User user ,Model  model ) {
		System.out.println("formpage");
		this.usrService.createUser(user);
		
		return "success";
	}

}
