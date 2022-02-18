package studentDetails.springMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentDetails.springMvc.student.Student;
import studentDetails.springMvc.studentdao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentdao;
	
	
	public int createStudent(Student student) {
	
		return this.studentdao.saveStudentDetails(student);
	}

}
