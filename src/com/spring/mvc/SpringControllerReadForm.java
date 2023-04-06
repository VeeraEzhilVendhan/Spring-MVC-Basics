package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/MVC")
public class SpringControllerReadForm {
	
	//method to show initial form
	@RequestMapping("/showform")
	public String showform()
	{
		return "form";
	}
	
	//method to process form
	@RequestMapping("/processform")
	public String processform()
	{
		return "form-result";
	}
	
	@RequestMapping("/processform2")
	public String processform2(HttpServletRequest request,Model model)
	{
		String name=request.getParameter("name");
		String name1=name.toUpperCase();
		
		model.addAttribute("changed_name", name1);
		
		return "form-result";
	}
	
	// getting parameter using request param
	@RequestMapping("/processform3")
	public String processform3(@RequestParam("name") String Name,Model model)
	{
		
		String name1=Name.toUpperCase();
		
		model.addAttribute("changed_name", name1);
		
		return "form-result";
	}

}
