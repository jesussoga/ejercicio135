package com.inserta.ejercicio135.usuarios.models;

import com.inserta.ejercicio135.roles.models.Rol;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int idRol;
    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id")
    private Rol rol;
    private String nombre;
    private String correo;
    private String clave;
}
