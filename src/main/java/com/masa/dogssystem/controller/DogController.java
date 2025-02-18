package com.masa.dogssystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masa.dogssystem.model.Dog;
import com.masa.dogssystem.service.DogService;

@RestController
// This class copes with HTTP requests and return JSON
//responses.
@RequestMapping("/dog")
//It sets the base path for all endpoints in this controller
@CrossOrigin
//To enable both React and Spring boot to do Cross-Origin Resource Sharing(CORS)for a REST API
//here the resources are local host 3000 (Frontend) and 8080 (Backend).
public class DogController {

	@Autowired
	// Spring boot manages functions to create an instance
	// thanks to @Autowired
	private DogService dogService;

	@PostMapping("/add")
	// it handles HTTP post requests at "/dog/add
	public String add(@RequestBody Dog dog) {
		// "@RequestBody Dog dog" extracts JSON request body and convert it
		// into a Dog object
		dogService.saveDog(dog);
		// this method saves the Dog object in the database.
		return "New dog is added";
	}

	@GetMapping("/getAll")
	// it handles get requests at "/dog/getAll
	public List<Dog> getAllDogs() {
		return dogService.getAllDogs();
	}

}
