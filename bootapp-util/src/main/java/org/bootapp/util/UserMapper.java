package org.bootapp.util;

import org.bootapp.datamodel.User;
import org.bootapp.dto.UserDTO;

public class UserMapper {
	public static User mapUser(UserDTO dto){
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		return user;
	}
}
