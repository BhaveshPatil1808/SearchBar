package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "redirect:/index";
	}

	@RequestMapping("/index")
	public String home(Model m) {
		System.out.println("This is home...");
		m.addAttribute("name", "Bhavesh");
		m.addAttribute("val", 12);

		List<String> myFavCity = new ArrayList<String>();
		myFavCity.add("Mumbai");

		m.addAttribute("city", myFavCity);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/help")
	public String help(Model m) {
		m.addAttribute("time", LocalDateTime.now());
		return "help";
	}

//	@RequestMapping(path="/form")
//	public String form() {
//		return "form";
//	}
//	
//	@RequestMapping(path="/getInfo", method=RequestMethod.POST)
//	public String getInfo(HttpServletRequest req, Model m){
//		String name = req.getParameter("name");
//		String email = req.getParameter("email");
//		String contact = req.getParameter("contact");
//		m.addAttribute("name",name);
//		m.addAttribute("email",email);
//		m.addAttribute("contact", contact);
//		return "formsucess";
//	}

}
