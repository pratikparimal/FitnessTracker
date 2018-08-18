package my.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import my.springmvc.model.Activity;
import my.springmvc.model.Exercise;
import my.springmvc.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	ExerciseService service;

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
		
		System.out.println("Execrice: "+exercise.getMinutes());
		System.out.println("Execrice Activity: "+exercise.getActivity());
		
		return "addMinutes";
		//return "forward:addMoreMinutes.html";
		//return "redirect:addMoreMinutes.html";
	}
	
	/*@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
		
		System.out.println("More Execrice: "+exercise.getMinutes());
		return "addMinutes";
	}*/
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities()
	{
		return service.findAllActivities();
	}
}
