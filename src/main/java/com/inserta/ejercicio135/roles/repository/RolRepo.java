package com.inserta.ejercicio135.roles.repository;

import com.inserta.ejercicio135.roles.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "roles")
public interface RolRepo extends JpaRepository<Rol, Integer> {
}
