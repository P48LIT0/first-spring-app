package springdemo.mvc;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentForm {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "displayName";
	}
	
	@RequestMapping("/processFormV2")
	public String displayNameOfStudent(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		theName=theName.toUpperCase();
		List<String> list1 = Arrays.asList("India","China","Bhutan");
		model.addAttribute("message", theName);
		model.addAttribute("message2", list1);
		return "displayName";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName, Model model) {
		
		//String theName = request.getParameter("studentName");
		theName=theName.toUpperCase();
		
		model.addAttribute("message", theName);
		
		return "displayName";
	}
}
