package com.apirest.ejp1.model;

import com.apirest.ejp1.dto.LibroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name = "libros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lib_codigo")
    private Integer codigo;
    @Column(name = "lib_isbn")
    private String isbn;
    @Column(name = "lib_nombre")
    private String nombre;
    @Column(name = "lib_descrip")
    private String descripcionGeneral;
    @Column(name = "lib_editorial")
    private String editorial;
    @Column(name = "lib_genero")
    private String genero;
    @Column(name = "lib_nropaginas")
    private int numeroPaginas;
    @Column(name = "lib_precio")
    private BigDecimal precio;
    @Column(name = "lib_fecha_edicion")
    private LocalDate fechaEdicion;
    @ManyToOne
    @JoinColumn(name = "aut_codigo", referencedColumnName = "aut_codigo")
    private Autor autor;
    @Column(name = "lib_fecha_reg", insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaRegistro;
    @Column(name = "lib_fecha_actu", insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaActualizacion;

    public Libro(LibroDTO libroDTO) {
        this.codigo = libroDTO.getCodigo();
        this.isbn = libroDTO.getIsbn();
        this.nombre = libroDTO.getNombre();
        this.descripcionGeneral = libroDTO.getDescripcionGeneral();
        this.editorial = libroDTO.getEditorial();
        this.genero = libroDTO.getGenero();
        this.numeroPaginas = libroDTO.getNumeroPaginas();
        this.precio = libroDTO.getPrecio();
        this.fechaEdicion = libroDTO.getFechaEdicion();
        this.autor = new Autor(libroDTO.getAutorDTO());
//        this.fechaRegistro = libroDTO.getFechaRegistro();
//        this.fechaActualizacion = libroDTO.getFechaActualizacion();
    }
}
