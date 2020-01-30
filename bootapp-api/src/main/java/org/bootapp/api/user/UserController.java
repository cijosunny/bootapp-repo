package org.bootapp.api.user;

import java.util.ArrayList;
import java.util.List;

import org.bootapp.datamodel.User;
import org.bootapp.dto.UserDTO;
import org.bootapp.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/{name}")
	public String getUserName(@PathVariable("name") String username){
		return userService.getByUserName(username);
	}
	
	@PostMapping
	public String saveUser(@RequestBody UserDTO user){
		return userService.saveUser(user);
	}
	
	@GetMapping
	public List<UserDTO> list(){
		List<User> users = userService.list();
		List<UserDTO> userslist = new ArrayList<>();
		UserDTO userDTO;
		for (User user : users) {
			userDTO = new UserDTO();
			userDTO.setUsername(user.getUsername());
			userslist.add(userDTO);
		}
		return userslist;
	}
}
