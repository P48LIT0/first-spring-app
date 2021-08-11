package springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("test", new Test());
		return "test-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm (@Valid @ModelAttribute("test") Test theTest, BindingResult theBindingResult) {
		String carMark = theTest.getCarMark();
		String opel = "opel";
		String opel1 = "Opel";
		String opel2 = "OPEL";
		
		String merc = "mercedes";
		String merc1 = "Mercedes";
		String merc2 = "MERCEDES";
		
		String ford = "ford";
		String ford1 = "Ford";
		String ford2 = "FORD";
		
		String audi = "audi";
		String audi1 = "Audi";
		String audi2 = "AUDI";
		System.out.println(carMark);
		if(theBindingResult.hasErrors()) {
			return "test-form";
		}
		if(carMark.equals(opel) || carMark.equals(opel1) || carMark.equals(opel2)) {
			return "test-opel";
		}
		if(carMark.equals(merc) || carMark.equals(merc1) || carMark.equals(merc2)) {
			return "test-merc";
		}
		if(carMark.equals(ford) || carMark.equals(ford1) || carMark.equals(ford2)) {
			return "test-ford";
		}
		if(carMark.equals(audi) || carMark.equals(audi1) || carMark.equals(audi2)) {
			return "test-audi";
		}
		else
		return "test-confirmation";
	}
}
