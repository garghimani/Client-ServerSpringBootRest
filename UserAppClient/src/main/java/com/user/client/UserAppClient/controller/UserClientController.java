package com.user.client.UserAppClient.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.client.UserAppClient.vo.User;

@RestController
public class UserClientController {

	RestTemplate restTemplate = new RestTemplate();

	private static final String ROOT_URI = "http://localhost:8888";

	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String entryUser(@ModelAttribute User user) {
		System.out.println("entryAddBook Controller : entryAddBookDetails() : Start");

		System.out.println("entryAddBook Controller : entryAddBookDetails() : End");
		return "home";
	}

	// -------------------CREATE USER-----------------------------
	@RequestMapping("/createUser.do")
	private String createUser(Model model, @ModelAttribute User user) {
		System.out.println("UserClientController : createUser() : Start");
		System.out.println("User Id passed by Client : " + user.getId());
		model.addAttribute("user", user);
		restTemplate.postForEntity(ROOT_URI + "/createUser", user, User.class);
		System.out.println("UserClientController : createUser() : End");
		return "displayUser";
	}

	// ---------------RETRIEVE USER-------------------------------

	@RequestMapping("/displayUser.do")
	public String getUser(Model model, @ModelAttribute User user) {
		System.out.println("UserClientController : getUser() : Start");
		System.out.println("User Id passed by Client : " + user.getId());
		user = restTemplate.getForObject(ROOT_URI + "/getUser/{id}", User.class, user.getId());
		model.addAttribute("user", user);
		System.out.println("UserClientController : getUser() : End");
		return "displayUser";
	}

	// -----------------UPDATE USER---------------------------------
	@RequestMapping("/modifyUser.do")
	public String modifyUser(Model model, @ModelAttribute User user) {
		System.out.println("UserClientController : updateUser() : Start");
		System.out.println("User Id passed by Client : " + user.getId());
		user = restTemplate.getForObject(ROOT_URI + "/getUser/{id}", User.class, user.getId());
		model.addAttribute("user", user);
		System.out.println("UserClientController : updateUser() : End");
		return "updateUser";
	}

	@RequestMapping("/updateUser.do")
	public String updateUser(Model model, @ModelAttribute User user) {
		System.out.println("UserClientController : modifyUser() : Start");
		System.out.println("User Id passed by Client : " + user.getId());
		restTemplate.put(ROOT_URI + "/updateUser", user);
		user = restTemplate.getForObject(ROOT_URI + "/getUser/{id}", User.class, user.getId());
		model.addAttribute("user", user);
		System.out.println("UserClientController : updateUser() : End");
		return "displayUser";
	}

	// -----------------DELETE USER---------------------------------
	@RequestMapping("/deleteUser.do")
	public String deleteUser(@ModelAttribute User user) {
		System.out.println("UserClientController : deleteUser() : Start");
		System.out.println("User Id passed by Client : " + user.getId());
		restTemplate.delete(ROOT_URI + "/deleteUser/"+user.getId() , User.class, user.getId());
		System.out.println("UserClientController : deleteUser() : End");
		return "home";
	}

	// -------------DISPLAY ON CONSOLE---------------------------------
	public static void printUserData(User user) {
		System.out.println("ID=" + user.getId() + ",Name=" + user.getFirstName());
	}

	public static void main(String[] args) {
		// displayUser();
	}
}
