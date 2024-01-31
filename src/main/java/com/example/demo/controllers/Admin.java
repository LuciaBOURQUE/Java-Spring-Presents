package com.example.demo.controllers;

import com.example.demo.models.Present;
import com.example.demo.services.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class Admin {
    @Autowired
    private Store storeAPI;

    // POST (Created)
    @PostMapping("presents")
    public ResponseEntity<?> add(@RequestBody Present p){
        storeAPI.add(p);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    // GET (Read all)
    @GetMapping("presents")
    public List<Present> getAll(){
        return storeAPI.getAll();
    }

    // GET (Read by id)
    @GetMapping("presents/{id}")
    public ResponseEntity<Present> getById(@PathVariable("id") Integer id){
        Optional<Present> opt = storeAPI.findById(id);
        if(opt.isEmpty()){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().build();
        }
    }

    // DELETE
    @DeleteMapping("presents/{id}")
    public void delete(@PathVariable("id") Integer id,
                       @RequestBody Present p){
        storeAPI.delete(p);
    }
}
