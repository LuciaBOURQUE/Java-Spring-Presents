package com.example.demo;

import com.example.demo.models.Present;
import com.example.demo.repositories.PresentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaRepositoryTests {
    @Autowired
    PresentRepository presentRepository;

    @Test
    void testAddPresent(){
        Present car = new Present("Peugeot Car", "Little blue car of Peugeot's label", 35.99);
        Present chair = new Present("Stack Chair", "Baby rainbow chair created  by Stack", 3_000.50);
        presentRepository.save(car);
        presentRepository.save(chair);
    }
}
