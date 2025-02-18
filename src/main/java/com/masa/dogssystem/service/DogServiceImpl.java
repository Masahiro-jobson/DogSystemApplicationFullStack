package com.masa.dogssystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masa.dogssystem.model.Dog;
import com.masa.dogssystem.repository.DogRepository;

@Service
// registers DogServiceImpl as a Spring-managed bean
// it enables Spring to handle dependency injects.
public class DogServiceImpl implements DogService {

	// @Autowired tells Spring Boot to automatically inject DogRepository
	// which interacts with the database.
	// It enables DogServiceImpl to invoke dogRepository.save(dog) w/o
	// manually creating an instance.
	// we don't need make a new object
	// (e.g. DogRepository dogRepository = new DogRepository();
	@Autowired
	private DogRepository dogRepository;

	@Override
	// dogRepository.save(dog) stores the Dog object in the database.
	public Dog saveDog(Dog dog) {
		return dogRepository.save(dog);
	}

	// dogRepostitory.findAll returns dog inf which finds
	// in the database to getAllDogs method.
	@Override
	public List<Dog> getAllDogs() {
		return dogRepository.findAll();
	}
}
