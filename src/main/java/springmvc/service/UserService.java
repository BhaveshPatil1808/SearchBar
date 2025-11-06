package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.UserDao;
import springmvc.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public int save(User u){
		return this.dao.save(u);
	}

}
