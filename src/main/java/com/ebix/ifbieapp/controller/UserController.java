package com.ebix.ifbieapp.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ebix.ifbieapp.model.User;
import com.ebix.ifbieapp.repository.PicfUserRepository;

@CrossOrigin()
@ControllerAdvice
@RequestMapping(value = "/users")
@ResponseBody
public class UserController {

	@Autowired
	@Qualifier("picfUserRepository")
	PicfUserRepository picfUserRepository;
	
	private List<User> users = new ArrayList();

	UserController() {
		this.users = buildUsers();
	}

//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping()
	public List<User> getUsers() {
		picfUserRepository.findOne(new BigDecimal(52));
		return this.users;
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long id) {
		return this.users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
	}

//	@RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public User saveUser(@RequestBody User user) {
		Long nextId = 0L;
		if (this.users.size() != 0) {
			User lastUser = this.users.stream().skip(this.users.size() - 1).findFirst().orElse(null);
			nextId = lastUser.getId() + 1;
		}

		user.setId(nextId);
		this.users.add(user);
		return user;

	}

//	@RequestMapping(method = RequestMethod.PUT)
	@PutMapping
	public User updateUser(@RequestBody User user) {
		User modifiedUser = this.users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		modifiedUser.setFirstName(user.getFirstName());
		modifiedUser.setLastName(user.getLastName());
		modifiedUser.setEmail(user.getEmail());
		return modifiedUser;
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@DeleteMapping
	public boolean deleteUser(@PathVariable Long id) {
		User deleteUser = this.users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
		if (deleteUser != null) {
			this.users.remove(deleteUser);
			return true;
		} else {
			return false;
		}

	}

	List<User> buildUsers() {
		List<User> users = new ArrayList<>();

		User user1 = buildUser(1L, "John", "Doe", "john@email.com");
		User user2 = buildUser(2L, "Jon", "Smith", "smith@email.com");
		User user3 = buildUser(3L, "Will", "Craig", "will@email.com");
		User user4 = buildUser(4L, "Sam", "Lernorad", "sam@email.com");
		User user5 = buildUser(5L, "Ross", "Doe", "ross@email.com");

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);

		return users;

	}

	User buildUser(Long id, String fname, String lname, String email) {
		User user = new User();
		user.setId(id);
		user.setFirstName(fname);
		user.setLastName(lname);
		user.setEmail(email);
		return user;
	}

}