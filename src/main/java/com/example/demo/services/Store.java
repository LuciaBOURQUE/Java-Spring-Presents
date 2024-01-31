package com.example.demo.services;

import com.example.demo.models.Present;
import com.example.demo.repositories.PresentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Store {
    @Autowired
    PresentRepository presentRepository;

    // CREATED
    public void add(Present p){
        presentRepository.save(p);
    }

    // READ all
    public List<Present> getAll(){ return presentRepository.findAll();}

    // READ by id
    public Optional<Present> findById(Integer id){
        return presentRepository.findById(id);
    }

    // UPDATE
    public void update(Present p){
        presentRepository.save(p);
    }

    // DELETE
    public void delete(Present p){presentRepository.delete(p);}
}
