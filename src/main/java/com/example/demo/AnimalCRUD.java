package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface AnimalCRUD extends CrudRepository<Animal, Integer> {

}
