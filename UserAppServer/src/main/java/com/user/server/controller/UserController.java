package com.user.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.db.vo.User;
import com.user.server.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	// -------------------------CREATE USER-----------------------------------
	@PostMapping(value="/createUser", consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Void> addUser(@RequestBody User user) {
		System.out.println("addUser() Controller: Start");
		userService.addUser(user);
		System.out.println("addUser() Controller: End");
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	// -------------------------RETRIEVE USER-----------------------------------
	@GetMapping(value="/getUser/{id}" ,produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<User> getUser(@PathVariable("id") int id) {
		System.out.println("getUser() Controller: Start");
		userService.getuser(id);
		System.out.println("getUser() Controller: End");
		return new ResponseEntity<User>(userService.getuser(id), HttpStatus.OK);
	}

	// -------------------------UPDATE USER-----------------------------------
	@PutMapping(value="/updateUser", consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		System.out.println("updateUser() Controller: Start");
		userService.updateUser(user);
		System.out.println("updateUser() Controller: End");
		return new ResponseEntity<User>(HttpStatus.ACCEPTED);
	}

	// -------------------------DELETE USER-----------------------------------
	@DeleteMapping(value="/deleteUser/{id}", consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {
		System.out.println("deleteUser() Controller: Start");
		userService.deleteUser(id);
		System.out.println("deleteUser() Controller: End");
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

}
