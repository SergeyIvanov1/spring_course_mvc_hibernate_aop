package ru.sergeyivanov.spring.mvc_hibernate_aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sergeyivanov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import ru.sergeyivanov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String allEmployees(Model model){

        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("AllEmps", allEmployees);

//        return "all-employees";
        return "ttt";
    }

    @RequestMapping("/ttt")
    public String getTTT(){
        return "ttt";
    }
}
