package com.inserta.ejercicio135.provincias;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString

@Entity
@Table(name = "provincias")
public class Provincia {
    @Id
    private String id;
    private String nombre;
}
