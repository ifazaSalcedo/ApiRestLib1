package com.apirest.ejp1.services;

import com.apirest.ejp1.dto.LibroDTO;
import com.apirest.ejp1.model.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroFactoryServices {
    public Libro createLibro(LibroDTO libroDTO){
        return new Libro(libroDTO);
    }
    public LibroDTO createLibroDTO(Libro libro){
        return new LibroDTO(libro);
    }
    public List<LibroDTO> createListaLibroDTO(List<Libro> listaLibros){
        List<LibroDTO> librosDTO = new ArrayList<>();
        listaLibros.stream().forEach(libros -> {
            librosDTO.add(new LibroDTO(libros));
        });
        return librosDTO;
    }
}
