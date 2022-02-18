package studentDetails.springMvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import studentDetails.springMvc.service.StudentService;
import studentDetails.springMvc.student.Student;


@Controller
public class HomeController {
	
	@Autowired
	private  StudentService  studService;
	
	@ModelAttribute
	public void commondata() {
		
	}
	
	@RequestMapping("/home")
	public String homePageHandler(Model mod) {
		mod.addAttribute("title", "Resirstration Form");
		mod.addAttribute("desc", "Do it Quickly");
		
		return "home";
	}
	
	
	@RequestMapping(path="/studentDet" , method=RequestMethod.POST)
	public String formHandler(@ModelAttribute Student student , Model mod) {
		
		this.studService.createStudent(student);
		
		if(student.getSname().isBlank()) {
			return "redirect:/contact";
		}
		
		System.out.println(student.getSname()+" "+student.getSid()+" "+student.getSem());
		
		return "success";
	}

}
