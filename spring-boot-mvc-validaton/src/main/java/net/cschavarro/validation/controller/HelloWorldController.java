package net.cschavarro.validation.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.cschavarro.validation.model.Student;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	/**
	 * Default GET Controller, always to register
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "enroll";
	}
	
	/**
	 * This method will be called on form submission, handling post request <br>
	 * It also validates user input
	 * @param student
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String saveRegitration(@Valid Student student, BindingResult result, ModelMap model) {
		if (result != null && result.hasErrors()) {
			model.addAttribute("failure", "Registration Failed, please checkk your information!");
			return "enroll";
		}
		
		model.addAttribute("succes", "Dear " + student.getFirstName() + ", your Registratio completed succesfully!");
		return "succes";
	}
	
	/*
     * Method used to populate the Section list in view.
     * Note that here you can call external systems to provide real data.
     */
    @ModelAttribute("sections")
    public List<String> initializeSections() {
 
        List<String> sections = new ArrayList<String>();
        sections.add("Graduate");
        sections.add("Post Graduate");
        sections.add("Research");
        return sections;
    }
 
    /*
     * Method used to populate the country list in view.
     * Note that here you can call external systems to provide real data.
     */
    @ModelAttribute("countries")
    public List<String> initializeCountries() {
 
        List<String> countries = new ArrayList<String>();
        countries.add("USA");
        countries.add("CANADA");
        countries.add("FRANCE");
        countries.add("GERMANY");
        countries.add("ITALY");
        countries.add("OTHER");
        return countries;
    }
 
    /*
     * Method used to populate the subjects list in view.
     * Note that here you can call external systems to provide real data.
     */
    @ModelAttribute("subjects")
    public List<String> initializeSubjects() {
 
        List<String> subjects = new ArrayList<String>();
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Life Science");
        subjects.add("Political Science");
        subjects.add("Computer Science");
        subjects.add("Mathmatics");
        return subjects;
    }
 
}
