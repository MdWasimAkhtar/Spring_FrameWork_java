package springMVCApp02.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVCApp02.Client.User;
import springMVCApp02.UserDao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao user;
	
	public int createUser(User usr) {
		return this.user.insert(usr);
	}

}
