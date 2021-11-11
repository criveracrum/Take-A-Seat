package edu.depaul.se452.group4.takeaseat.demo.employee;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String login(Model model) {

        return "employees/profile";

    }

    @GetMapping
    public ModelAndView showEmployees() {
        ModelAndView mv = new ModelAndView("list-employees");
        mv.addObject("employees", employeeService.findAll());
        return mv;
    }

    @GetMapping("/add")
    public String showSignUpForm(Employee employee) {
        return "add-employee";
    }

    @PostMapping
    public String add(@Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-employee";
        }

        employeeService.update(employee);
        model.addAttribute("employees", employeeService.findAll());
        return "redirect:/employees";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") String employeeId, Model model) {
        Employee employee = employeeService.findById(employeeId);
        model.addAttribute("employee", employee);
        return "edit-employee";
    }

    @PostMapping("/edit")
    public String update(@Valid Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "edit-employee";
        }

        employeeService.update(employee);
        return "redirect:/employees";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String employeeId, Model model) {
        employeeService.deleteById(employeeId);
        return "redirect:/employees";
    }

}