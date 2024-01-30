package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Users;

@RestController
@RequestMapping("/home")
public class DemoController {
	
	List<Users> listOfUser=new ArrayList<>();
	
	public DemoController() {
		listOfUser.add(new Users("1", "Pranav", "Pranav@xyz.com"));
		listOfUser.add(new Users("2", "Raj", "Raj@xyz.com"));
	}

	@GetMapping("/security")
	public ResponseEntity<String> demoController(){
		return ResponseEntity.ok("Hello Welcome to Spring security Using jwt");
	}
	
	@PostMapping("/getUser")
	public ResponseEntity<List<Users>> getUser(){
		return ResponseEntity.ok(listOfUser);
	}
}
