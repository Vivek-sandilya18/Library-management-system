package in.library_management.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import in.library_management.status.entity.Status;
import in.library_management.status.service.StatusService;
import in.library_management.user.service.UserService;

@Controller
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public String statusUser(@PathVariable Integer userId, Model model) {
        Status status = new Status();
        status.setUser(userService.getUserById(userId));

        model.addAttribute("status", status); 
        model.addAttribute("records", statusService.getBooksByUser(userId)); 

        return "status"; 
    }

    @PostMapping("/save")
    public String saveStatus(@ModelAttribute("status") Status status) {
        statusService.saveBook(status);
        return "redirect:/status/" + status.getUser().getId(); 
    }
}
