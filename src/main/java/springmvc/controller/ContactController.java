package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(path="/form")
	public RedirectView showForm(){
		
		RedirectView rd = new RedirectView();
		rd.setUrl("https://google.com");
		return rd;
	}
	
	
	@RequestMapping(path="/getInfo",method=RequestMethod.POST)
	public String getInfo(@ModelAttribute User user, Model m){
		System.out.println(user);
		this.service.save(user);
//		m.addAttribute("user", user);
		
		return "formsucess";
	}
	


}
