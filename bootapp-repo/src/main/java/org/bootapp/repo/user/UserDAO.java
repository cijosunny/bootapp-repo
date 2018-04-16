package org.bootapp.repo.user;

import java.util.List;

import org.bootapp.datamodel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long>{
	public List<User> findByUsername(String username);
}
