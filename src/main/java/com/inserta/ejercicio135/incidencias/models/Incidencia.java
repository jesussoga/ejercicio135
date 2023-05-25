package com.inserta.ejercicio135.incidencias.models;

import com.inserta.ejercicio135.centrales.models.Central;
import com.inserta.ejercicio135.usuarios.models.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor
@Getter  @Setter
@ToString

@Entity
@Table(name = "incidencias")
public class Incidencia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;
//    private int idUsuario;
    @ManyToOne
    @JoinColumn(name = "id_central", referencedColumnName = "id")
    private Central central;
//    private int idCentral;
    private String texto;
    private LocalDateTime fecha;
    private boolean resuelta;
}
