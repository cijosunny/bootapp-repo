package org.bootapp.service.user;

import org.bootapp.dto.UserDTO;

public interface UserService {
	public String getByUserName(String username);
	public String saveUser(UserDTO user);
}
