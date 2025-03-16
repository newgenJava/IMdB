package com.newgen.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.newgen.user.model.User;

import jakarta.validation.Valid;

@RestController
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/users")
	public List<User> findAllUsers() {
		return userService.findAll();
	}
	
	@PostMapping(path = "/users")
	public ResponseEntity<Object> addUser(@Valid @RequestBody User user) {
		User addedUser = userService.save(user);
		UriComponents uriLocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(addedUser.getId());

		return ResponseEntity.created(uriLocation.toUri()).build();
	}
	
	@GetMapping(path = "/users/{id}")
	public User findUserById(@PathVariable int id) {
		Optional<User> userFound = userService.findOne(id);

		if (userFound.isEmpty()) {
//			throw new UserNotFoundException(" No User found for id : " + id);
		}

		return userFound.get();
	}

}
