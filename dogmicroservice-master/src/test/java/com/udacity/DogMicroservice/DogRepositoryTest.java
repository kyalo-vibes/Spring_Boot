package com.udacity.DogMicroService;

import com.udacity.DogMicroService.entity.Dog;
import com.udacity.DogMicroService.repository.DogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class DogRepositoryTest {

    @Autowired
    private DogRepository dogRepository;

    @BeforeEach
    public void setUp() {
        dogRepository.deleteAll();
    }

    @Test
    public void testSaveDog() {
        // Given
        Dog dog = new Dog(null, "Buddy", "Labrador Retriever", "Canada");

        // When
        dogRepository.save(dog);

        // Then
        assertThat(dog.getId()).isNotNull();
    }

    @Test
    public void testFindDogById() {
        // Given
        Dog dog = new Dog(null, "Buddy", "Labrador Retriever", "Canada");
        dogRepository.save(dog);

        // When
        Optional<Dog> result = dogRepository.findById(dog.getId());

        // Then
        assertThat(result).isPresent();
        assertThat(result.get().getName()).isEqualTo("Buddy");
        assertThat(result.get().getBreed()).isEqualTo("Labrador Retriever");
        assertThat(result.get().getOrigin()).isEqualTo("Canada");
    }

    @Test
    public void testFindAllDogs() {
        // Given
        Dog dog1 = new Dog(null, "Buddy", "Labrador Retriever", "Canada");
        Dog dog2 = new Dog(null, "Max", "German Shepherd", "USA");
        dogRepository.save(dog1);
        dogRepository.save(dog2);

        // When
        List<Dog> result = (List<Dog>) dogRepository.findAll();

        // Then
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(2);
        assertThat(result.get(0).getName()).isEqualTo("Buddy");
        assertThat(result.get(0).getBreed()).isEqualTo("Labrador Retriever");
        assertThat(result.get(0).getOrigin()).isEqualTo("Canada");
        assertThat(result.get(1).getName()).isEqualTo("Max");
        assertThat(result.get(1).getBreed()).isEqualTo("German Shepherd");
        assertThat(result.get(1).getOrigin()).isEqualTo("USA");
    }

    @Test
    public void testDeleteDog() {
        // Given
        Dog dog = new Dog(null, "Buddy", "Labrador Retriever", "Canada");
        dogRepository.save(dog);

        // When
        dogRepository.deleteById(dog.getId());

        // Then
        Optional<Dog> result = dogRepository.findById(dog.getId());
        assertThat(result).isEmpty();
    }

    @Test
    public void testUpdateDog() {
        // Given
        Dog dog = new Dog(null, "Buddy", "Labrador Retriever", "Canada");
        dogRepository.save(dog);

        // When
        dog.setName("Max");
        dog.setBreed("German Shepherd");
        dog.setOrigin("USA");
        dogRepository.save(dog);

        // Then
        Optional<Dog> result = dogRepository.findById(dog.getId());
        assertThat(result).isPresent();
        assertThat(result.get().getName()).isEqualTo("Max");
        assertThat(result.get().getBreed()).isEqualTo("German Shepherd");
        assertThat(result.get().getOrigin()).isEqualTo("USA");
    }
}