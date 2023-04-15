package com.example.DogGraphQL.repository;

import com.example.DogGraphQL.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {
    @Query("select d.id, d.breed from Dog d where d.id=:id")
    String findDogBreedById(Long id);

    @Query("select d.id, d.breed from Dog d")
    List<String> findDogBreed();

    @Query("select d.id, d.name from Dog d")
    List<String> findDogNames();
}
