package in.library_management.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.library_management.status.service.StatusService;
import in.library_management.user.entity.Users;
import in.library_management.user.service.UserService;

@Controller

public class UserController {

	
	@Autowired
	 private final UserService userservice;
	@Autowired
	private final StatusService statusservice;

	UserController(UserService userservice, StatusService statusservice) {
		this.userservice = userservice;
		this.statusservice = statusservice;
	}

	@GetMapping("/")
	public String form(Model model) {
		model.addAttribute("title", "this is library");
		model.addAttribute("user", new Users());
		return "form";
	}

	@GetMapping("/users")
	public String getUser(Model model) {
		List<Users> users = userservice.getUser();

		model.addAttribute("users", users);

		return "user";
	}

	@PostMapping("/")
	public String saveUser(@ModelAttribute Users user, Model model) {
		model.addAttribute("user", new Users());
		userservice.saveUser(user);
		return "redirect:/users";
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer id, Model model) {
		userservice.deleteUser(id);
		return "redirect:/users";
	}
	
	
	
	
	
		
	
}
