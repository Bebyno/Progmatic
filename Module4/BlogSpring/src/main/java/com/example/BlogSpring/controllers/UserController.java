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

    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = {"/", "/home"})
    public String getHello() {
        return "hello";
    }

    @GetMapping("/user")
    public User getLoggedInUser() {
        return service.getLoggedInUser();
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping(value = {"/users/{id}"})
    public ResponseEntity<User> getById(@PathVariable long id) throws UserNotFoundException {
        Optional<User> user = service.getOneUser(id);
        if (user.isPresent()) {
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        } else {
            throw new UserNotFoundException();
        }
    }



    /*public User getOneUser(@PathVariable("id") long id) {
        if (id != 0) {
            return service.getOneUser(id);
        }
        return null;
    }*/


/*    @GetMapping("/register")
    public String registerUser() {
        boolean registered = service.registerUsers();
        if (registered) {
            return "ok";
        }
        return "not ok";
    }*/

@PostMapping(path = "/register",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> create(@RequestBody User newUser) throws ServerException {
		User user = service.register(newUser);
		if (user == null) {
			throw new ServerException();
		}
		else {
			return new ResponseEntity<>(user, HttpStatus.CREATED);
		}
	}


}
