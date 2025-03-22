package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class StudentDetailsController {
    
    @GetMapping("/studentdetails")
    public String studentDetails() {
		String name = "Name: A. R. Wijesuriya";
		String age = "Age: 25";
		String regno = "Reg. No: 2020ICT101";
		String course = "Course: IT";
		
		return name + "<br>" + age + "<br>" + regno + "<br>" + course;
	}
}
