package org.bootapp.service.user;

import org.bootapp.datamodel.User;

public interface UserService {
	public String getByUserName(String username);
	public String saveUser(User user);
}
