package com.apirest.ejp1.services;

import com.apirest.ejp1.dto.AutorDTO;
import com.apirest.ejp1.dto.LibroDTO;
import com.apirest.ejp1.model.Autor;
import com.apirest.ejp1.model.Libro;
import com.apirest.ejp1.repository.AutorRepository;
import com.apirest.ejp1.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private LibroFactoryServices libroFactoryServices;
    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private AutorFactoryServices autorFactoryServices;

    public LibroDTO save(LibroDTO libroDTO){
        //Buscar autor para el libro
        Autor autor = autorRepository.findById(libroDTO.getIdAutor()).get();
        libroDTO.setAutorDTO(autorFactoryServices.createAutorDTO(autor));

        return libroFactoryServices
                .createLibroDTO(libroRepository.save(
                        libroFactoryServices.createLibro(libroDTO)));
    }
    public List<LibroDTO> findAll(){
        return libroFactoryServices.createListaLibroDTO(libroRepository.findAll());
    }
    public LibroDTO findById(Integer id){
        return libroFactoryServices.createLibroDTO(libroRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        libroRepository.deleteById(id);
    }

}
