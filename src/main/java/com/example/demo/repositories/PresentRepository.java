package com.example.demo.repositories;

import com.example.demo.models.Present;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentRepository extends JpaRepository<Present, Integer> {
    // empty
}
