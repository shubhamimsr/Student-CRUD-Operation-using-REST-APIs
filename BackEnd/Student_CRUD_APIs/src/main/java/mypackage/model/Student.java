package mypackage.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblstudent_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String student_name;
	private String email;
	private String mobile;
	private String dob;
	private String department;
	private String section;
	private String address;
	private String createdon;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_id, String student_name, String email, String mobile, String dob, String department,
			String section, String address, String createdon) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.department = department;
		this.section = section;
		this.address = address;
		this.createdon = createdon;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedon() {
		return createdon;
	}
	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}
	
}
