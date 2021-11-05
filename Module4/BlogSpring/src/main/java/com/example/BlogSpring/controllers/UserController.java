package com.example.BlogSpring.controllers;

import com.example.BlogSpring.expections.ServerException;
import com.example.BlogSpring.expections.UserNotFoundException;
import com.example.BlogSpring.models.User;
import com.example.BlogSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = {"/", "/home"})
    public String getHello() {
        return "hello";
    }

    @GetMapping("/user")
    public User getLoggedInUser() {
        return userService.getLoggedInUser();
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = {"/users/{id}"})
    public ResponseEntity<User> getById(@PathVariable long id) throws UserNotFoundException {
        Optional<User> user = userService.getOneUser(id);
        if (user.isPresent()) {
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        } else {
            throw new UserNotFoundException();
        }
    }


@PostMapping(path = "/register",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> create(@RequestBody User newUser) throws ServerException {
		User user = userService.register(newUser);
		if (user == null) {
			throw new ServerException();
		}
		else {
			return new ResponseEntity<>(user, HttpStatus.CREATED);
		}
	}



}
