package com.apirest.ejp1.dto;

import com.apirest.ejp1.model.Autor;
import com.apirest.ejp1.model.Libro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class LibroDTO {
    private Integer codigo;
    private String isbn;
    private String nombre;
    private String descripcionGeneral;
    private String editorial;
    private String genero;
    private int numeroPaginas;
    private BigDecimal precio;
    private LocalDate fechaEdicion;
    private AutorDTO autorDTO;
    private Integer idAutor;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaActualizacion;

    public LibroDTO(Libro libro) {
        this.codigo = libro.getCodigo();
        this.isbn = libro.getIsbn();
        this.nombre = libro.getNombre();
        this.descripcionGeneral = libro.getDescripcionGeneral();
        this.editorial = libro.getEditorial();
        this.genero = libro.getGenero();
        this.numeroPaginas = libro.getNumeroPaginas();
        this.precio = libro.getPrecio();
        this.fechaEdicion = libro.getFechaEdicion();
        this.autorDTO = new AutorDTO(libro.getAutor());
        this.fechaRegistro = libro.getFechaRegistro();
        this.fechaActualizacion = libro.getFechaActualizacion();
    }
}
