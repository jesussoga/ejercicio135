package com.inserta.ejercicio135.usuarios.repository;

import com.inserta.ejercicio135.usuarios.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
    public Usuario findByCorreoAndClave(String correo, String clave);
    public boolean existsByCorreoAndClave(String correo, String clave);


}
