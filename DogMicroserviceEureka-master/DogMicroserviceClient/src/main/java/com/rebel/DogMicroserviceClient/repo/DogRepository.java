package com.rebel.DogMicroserviceClient.repo;

import com.rebel.DogMicroserviceClient.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long>
{

}
