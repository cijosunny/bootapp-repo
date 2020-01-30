package org.bootapp.service.user;

import java.util.List;

import org.bootapp.datamodel.User;
import org.bootapp.dto.UserDTO;

public interface UserService {
	public String getByUserName(String username);
	public String saveUser(UserDTO user);
	public List<User>  list();
}
