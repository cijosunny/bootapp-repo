package org.bootapp.service.user;

import java.util.List;

import org.bootapp.datamodel.User;
import org.bootapp.dto.UserDTO;
import org.bootapp.repo.user.UserDAO;
import org.bootapp.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDao;
	@Override
	public String getByUserName(String username) {
		List<User> user = userDao.findByUsername(username);
		if(!user.isEmpty())
			return user.get(0).getUsername();
		return null;
	}
	@Override
	public String saveUser(UserDTO user) {
		return userDao.save(UserMapper.mapUser(user)).getUsername();
	}

}
