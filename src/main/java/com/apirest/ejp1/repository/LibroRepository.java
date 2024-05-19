package com.apirest.ejp1.repository;

import com.apirest.ejp1.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}