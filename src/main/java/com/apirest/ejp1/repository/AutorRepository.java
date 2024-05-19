package com.apirest.ejp1.repository;

import com.apirest.ejp1.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
}