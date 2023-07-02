package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entity.Student;
import com.demo.repo.Studentrepo;

@Controller
public class ControllerClass {

	@Autowired
	private Studentrepo repo;

	@GetMapping("/student")
	public ModelAndView insertdata(@Validated @ModelAttribute("student") Student student, BindingResult result) {

		ModelAndView view = new ModelAndView();

		if (result.hasErrors()) {
			view.setViewName("index");
			return view;
		}

		String s = "Choose...";

		if ((student.getName() != null || student.getEmail() != null || student.getGender() != null)
			    && (!student.getName().isEmpty() || !student.getEmail().isEmpty() || !student.getGender().isEmpty())
			    && (!student.getCourse().equals(s) && !student.getTiming().equals(s))) {

			repo.save(student);
			List<Student> findAll = repo.findAll();
			if (findAll.isEmpty()) {
				view.addObject("error", "Data isn't Inserted Properly");
				view.setViewName("error");
			} else {
				view.addObject("student", "Data is Inserted Properly");
				view.setViewName("index");
			}

		} else {
			view.addObject("error", "All fields are required!");
			view.setViewName("error");
		}

		return view;

	}

	@ModelAttribute("genders")
	public String[] genders() {
		return new String[] { "Male", "Female", "Other" };
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		modelAndView.addObject("error", ex.getMessage());
		return modelAndView;
	}

}
