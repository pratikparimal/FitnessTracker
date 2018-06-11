package my.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import my.springmvc.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
		
		System.out.println("Execrice: "+exercise.getMinutes());
		return "addMinutes";
		//return "forward:addMoreMinutes.html";
		//return "redirect:addMoreMinutes.html";
	}
	
	/*@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
		
		System.out.println("More Execrice: "+exercise.getMinutes());
		return "addMinutes";
	}*/
}
