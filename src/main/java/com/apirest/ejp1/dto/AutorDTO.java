package com.apirest.ejp1.dto;


import com.apirest.ejp1.model.Autor;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
public class AutorDTO {
    private Integer codigo;
    @Size(max = 50, message = "Logitud del campo de nombre exedido a 50")
    @NotEmpty(message = "Campor nombre requerido")
    private String nombres;
    @Size(max = 50, message = "Logitud del campo de apellido exedido a 50")
    @NotEmpty(message = "Campo apellido requerido")
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
