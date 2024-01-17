package mypackage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.Repository.StudentRepository;
import mypackage.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentRepository srepo;
	
	public List<Student> GetAll(){
		return srepo.findAll();
	}
	
	public Student GetStudentById(int id) {
		return srepo.findById(id).get();
	}
	
	public Student AddOrUpdateStudent(Student s) {
		return srepo.save(s);
	}
	
	public Student DeleteStudent(int id) {
		Student s = GetStudentById(id);
		srepo.delete(s);
		return s;
	}
}
