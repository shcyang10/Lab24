package co.gc.CoffeeShopLab24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.CoffeeShopLab24.model.CoffeeDao;
import co.gc.CoffeeShopLab24.model.Person;

@Controller
public class CoffeeShopController {
	
	@Autowired
	CoffeeDao dao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index", "items", dao.findItems());
		
	}
	@RequestMapping("/register")
	public ModelAndView registrationPage() {
		return new ModelAndView("registration");
	}
	@RequestMapping("/submit-person")
	public ModelAndView addPerson(Person users) {
		dao.addUser(users.getName(), users.getEmail(), users.getPhoneNum(), users.getPassword());
		return new ModelAndView("summary", "newUsers", users.getName());
	}

}
