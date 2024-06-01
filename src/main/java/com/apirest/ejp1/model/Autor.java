package com.apirest.ejp1.model;

import com.apirest.ejp1.dto.AutorDTO;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "autores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aut_codigo")
    private Integer codigo;
    @Column(name = "aut_nombres")
    @Size(max = 50, message = "Logitud del campo de nombre exedido a 50")
    @NotEmpty(message = "Campor nombre requerido")
    private String nombres;
    @Column(name = "aut_apellidos")
    @Size(max = 50, message = "Logitud del campo de apellido exedido a 50")
    @NotEmpty(message = "Campo apellido requerido")
    private String apellidos;
    @Column(name = "aut_telefono")
    private String telefono;
    @Column(name = "aut_fecha_reg", insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaRegistro;

    @Column(name = "aut_fecha_actu", insertable = false, updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaActualizacion;

    public Autor(AutorDTO autorDTO) {
        this.codigo = autorDTO.getCodigo();
        this.nombres = autorDTO.getNombres();
        this.apellidos = autorDTO.getApellidos();
        this.telefono = autorDTO.getTelefono();
//        this.fechaRegistro = autorDTO.getFechaRegistro();
//        this.fechaActualizacion = autorDTO.getFechaActualizacion();
    }
}
