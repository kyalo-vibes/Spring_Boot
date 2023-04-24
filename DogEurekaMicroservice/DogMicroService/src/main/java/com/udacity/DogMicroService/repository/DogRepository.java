package com.udacity.DogMicroService.repository;

import com.udacity.DogMicroService.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
