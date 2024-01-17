package mypackage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mypackage.Service.StudentService;
import mypackage.model.Student;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class StudentApiController {
	@Autowired
	StudentService sservice;
	
	@GetMapping("api/student")
	public List<Student> GetStudents(){
		return sservice.GetAll();
	}
	
	@GetMapping("api/student/{student_id}")
	public Student GetById(@PathVariable("student_id") int id) {
		return sservice.GetStudentById(id);
	}
	
	@PostMapping("api/student")
	public Student AddStudent(@RequestBody Student s) {
		return sservice.AddOrUpdateStudent(s);
	}
	
	@PutMapping("api/student")
	public Student UpdateStudent(@RequestBody Student s) {
		return sservice.AddOrUpdateStudent(s);
	}
	
	@DeleteMapping("api/student/{student_id}")
	public Student DeleteStudent(@PathVariable("student_id")int id) {
		return sservice.DeleteStudent(id);
	}
}
