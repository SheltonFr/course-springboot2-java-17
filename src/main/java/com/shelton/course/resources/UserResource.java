package com.shelton.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shelton.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping //requicisoes do tipo Get
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "Maria", "Maria", "Maria");
		return ResponseEntity.ok().body(u);
	}
}
