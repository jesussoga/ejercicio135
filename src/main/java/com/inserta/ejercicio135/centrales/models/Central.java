package com.inserta.ejercicio135.centrales.models;


import com.inserta.ejercicio135.provincias.Provincia;
import com.inserta.ejercicio135.tipos.Tipo;
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
//    private int idTipo;
    @ManyToOne
    @JoinColumn(name = "id_tipo", referencedColumnName = "id")
    private Tipo tipo;
    private String latitud;
    private String longitud;
    private String descripcion;
    private String imagen;
    private int potencia;
    @ManyToOne
    @JoinColumn(name = "id_provincia", referencedColumnName = "id")
    private Provincia provincia;
//    private String idProvincia;
    private boolean activa;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String observaciones;
}
