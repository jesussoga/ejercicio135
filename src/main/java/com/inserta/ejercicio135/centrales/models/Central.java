package com.inserta.ejercicio135.centrales.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString

@Entity
@Table (name = "centrales")
public class Central {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idTipo;
    private String latitud;
    private String longitud;
    private String descripcion;
    private String imagen;
    private int potencia;
    private String idProvincia;
    private boolean activa;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String observaciones;
}
