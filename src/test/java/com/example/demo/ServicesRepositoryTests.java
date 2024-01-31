package com.example.demo;

import com.example.demo.models.Present;
import com.example.demo.services.Store;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

@SpringBootTest
class ServicesRepositoryTests {
    @Autowired
    Store storeDatabase;

    @Test
    void testAddPresent(){
        Present dole = new Present("Barbie", "Little mermaid Barbie on the beach", 30.50);
        Present bear = new Present("Winnie", "Bear brown Winnie collector", 48);
        storeDatabase.add(dole);
        storeDatabase.add(bear);
    }

    @Test
    void testUpdatePresent(){
        Optional<Present> opt = storeDatabase.findById(2);
        if(opt.isPresent()){
            Present present = opt.get();
            present.setName("Mickey");
            storeDatabase.update(present);
        }
    }
}
