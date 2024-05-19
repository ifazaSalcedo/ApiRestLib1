package com.apirest.ejp1.services;

import com.apirest.ejp1.dto.AutorDTO;
import com.apirest.ejp1.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private AutorFactoryServices autorFactoryServices;
    public AutorDTO save(AutorDTO autorDTO){
        return autorFactoryServices.createAutorDTO(
                autorRepository.save(
                autorFactoryServices.createAutor(autorDTO)));
    }
    public List<AutorDTO> findAll(){
        return autorFactoryServices.createListAutoresDTO(autorRepository.findAll());
    }
    public AutorDTO findById(Integer id){
        return autorFactoryServices.createAutorDTO(autorRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        autorRepository.deleteById(id);
    }
}
