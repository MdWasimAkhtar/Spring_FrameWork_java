package studentDetails.springMvc.studentdao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import studentDetails.springMvc.student.Student;


@Repository
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemp;
	
	public int saveStudentDetails(Student student) {
		
		int id =(Integer) this.hibernateTemp.save(student);
		return id;
	}
	

}
