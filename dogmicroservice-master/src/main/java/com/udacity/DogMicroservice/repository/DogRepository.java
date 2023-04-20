package com.udacity.DogMicroService.repository;

import com.udacity.DogMicroService.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
