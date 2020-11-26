package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;
import com.example.demo.model.StudentRegistration;

@Controller
public class HomeController {
	
	@Autowired
	StudentRegistration stuReg;
	
   @RequestMapping("/")
   public String home() {
	   return "index.jsp";
	   
   }
   
   @RequestMapping(method = RequestMethod.POST , value = "getStudents")
   @ResponseBody
   public List<Student> getStudents(){
	   return stuReg.getStudents();
   }
   
   @RequestMapping(method = RequestMethod.POST , value = "addStudent")
   @ResponseBody
   public Student addStudent(Student s) {
	   stuReg.addStudent(s);
	   return s;
   }
   
   @RequestMapping(method = RequestMethod.POST , value = "deleteStudent")
   @ResponseBody
   public Student deleteStudent(Student s) {
	   stuReg.deleteStudent(s.getId());
	   return s;
   }
}
