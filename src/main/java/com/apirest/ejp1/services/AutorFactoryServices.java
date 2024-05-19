package com.apirest.ejp1.services;

import com.apirest.ejp1.dto.AutorDTO;
import com.apirest.ejp1.model.Autor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorFactoryServices {
    public Autor createAutor(AutorDTO autorDTO){
        return new Autor(autorDTO);
    }
    public AutorDTO createAutorDTO(Autor autor){
        return new AutorDTO(autor);
    }

    public List<AutorDTO> createListAutoresDTO(List<Autor> listaAutores){
        List<AutorDTO> autoresDTO = new ArrayList<>();
        listaAutores.stream().forEach(autor -> {
            autoresDTO.add(createAutorDTO(autor));
        });
        return autoresDTO;
    }
}
