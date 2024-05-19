package com.apirest.ejp1.dto;


import com.apirest.ejp1.model.Autor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
public class AutorDTO {
    private Integer codigo;
    private String nombres;
    private String apellidos;
    private String telefono;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaActualizacion;

    public AutorDTO(Autor autor) {
        this.codigo = autor.getCodigo();
        this.nombres = autor.getNombres();
        this.apellidos = autor.getApellidos();
        this.telefono = autor.getTelefono();
        this.fechaRegistro = autor.getFechaRegistro();
        this.fechaActualizacion = autor.getFechaActualizacion();
    }
}
