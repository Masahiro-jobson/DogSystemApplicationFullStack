package com.masa.dogssystem.service;

import java.util.List;

import com.masa.dogssystem.model.Dog;

public interface DogService {
	// abstract method which is implemented by a concrete class
	// it returns a Dog object which means it will store
	// a dog and return it.
	// public Dog refers to type (Dog object type)
	public Dog saveDog(Dog dog);

	public List<Dog> getAllDogs();

}
