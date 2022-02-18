package springMVCApp02.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMVCApp02.Client.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public UserDao() {
		super();
	}
	
	@Transactional
	public int insert(User usr) {
	 Integer res = (Integer)this.hibernatetemplate.save(usr);
		
		return res;
	}
	

}
