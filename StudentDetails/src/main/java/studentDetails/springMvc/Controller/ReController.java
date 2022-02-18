package studentDetails.springMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		
		System.out.println("One : is working");
		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("enjoy");
		redirectView.setUrl("https://www.google.com");
	
//		return "redirect:/enjoy";
		return redirectView;
	}
	
	@RequestMapping("enjoy")
	public String enjoy() {
		
		System.out.println("Enjoy handler");
		return "home";
	}

}
