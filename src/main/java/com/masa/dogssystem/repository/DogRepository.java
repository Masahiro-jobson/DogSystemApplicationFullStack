package com.masa.dogssystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masa.dogssystem.model.Dog;

//We set "Integer" for second parameter cuz primary key is "int" types
//To inherit all the built-in mtd from JpaRepository, "extends" are used
//DogRepository and JpaRepository both are interface but there is inheritance.
@Repository // tells Spring that this interface has a responsiblity for database operations.
public interface DogRepository extends JpaRepository<Dog, Integer> {

}
